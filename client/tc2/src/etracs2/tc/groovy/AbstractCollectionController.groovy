package etracs2.tc.groovy

import com.rameses.rcp.common.*
import com.rameses.rcp.annotations.*
import com.rameses.osiris2.client.*
import com.rameses.osiris2.reports.*
import etracs2.groovy.*
import java.rmi.server.UID
        
abstract class AbstractCollectionController
{
    def ONLINE_MODE = 'ONLINE'
    def OFFLINE_MONE = 'OFFLINE'
    def CAPTURE_MODE = 'CAPTURE'
    def DELEGATED_STATE = 'DELEGATED'
    def OPEN_STATE = 'OPEN'
    def CAPTURED_STATE = 'CAPTURED'
    
            
    @Binding
    def binding

    def mode
    def entity
    def af 
    def afcontrol
    def collectiontype
    def collector
    def subcollector
    def txnmode
    def txndate
    def openerType
            
    def backHandler
    def newHandler
    def updateHandler
    def deleteHandler
    def payor
    
            
    abstract def getService()
    abstract def getHtmlService()
    abstract def getCollectionTitle() 
    abstract def getParameters()
    
    void init() {
        mode = 'create'
        entity = createEntity()
    }
    
    def initInquiry() {
        mode = 'view'
        return 'html' 
    }
    
    void doNew() {
        invokeNewHandler()
    }
    
    def edit() {
        mode = 'edit'
        entity = svc.open( entity.objid )
        checkAllowEdit()
        reinitializePaymentSummary()
        payor = [objid:entity.info.payorid, entityname:entity.info.payorname]
        return 'default'
    }
    
    void newRecord() {
        init()
        paymentSummary.handle.reload()
    }
    
    void back() {
        if( backHandler ) backHandler()
    }
    
    def create() {
        if( MsgBox.confirm("Save collection?") ) {
            validateTxnDate()
            resetItemIncomeAcctInfo()
            entity = svc.create( entity )
            
            if( entity.info.mode != 'CAPTURE' ) {
                print()
            }
            
            mode = 'view'
            return 'view'
        }
        return null
    }
    
    def update() {
        if( MsgBox.confirm("Update collection?") ) {
            validateTxnDate()
            resetItemIncomeAcctInfo()
            svc.update( entity )
            mode = 'view'
            invokeUpdateHandler()
            return 'view'
        }
        return null
    }
    
    void validateTxnDate() {
        if( txnmode == CAPTURE_MODE && !entity.info.txndate ) {
            CommonUtil.required('Txn Date', entity.info.txndate)
        }
    }
    
    void checkAllowEdit() {
        if( entity.voided == 1) throw new Exception('Document has already been voided.')
        if( entity.info.mode == ONLINE_MODE ) throw new Exception('Edit is not allowed for ONILNE transaction.')
    }
    
    def getReportName() { return 'receipt/af51' }
    def getDetailReportName() { return 'receipt/af51detail' }
    
    void print() { printNow( report ) }
    void printDetail() { printNow( detailReport ) }
    
    def doPrint() {
        entity = service.open( entity.objid )
        print()
        return '_close'
    }
    
    def doPrintDetail() {
        entity = svc.open( entity.objid )
        printDetail()
        return '_close'
    }
        
    
    void printNow( report ) {
        try {
            ReceiptUtil.buildReportInfo( entity )
            report.viewReport()
            ReportUtil.print( report.report, true )
        }
        catch( e ) {
            e.printStackTrace()
            MsgBox.err(e)
        }
    }
    
    def report = [
        getReportName : { return getReportName() },
        getReportData : { return entity } ,
        getParameters : { return getParameters() }
    ] as ServerReportModel;
        
    def detailReport = [
        getReportName : { return getDetailReportName() },
        getReportData : { return entity } ,
    ] as ServerReportModel;
        
    
    void voidReceipt() {
        if( MsgBox.confirm('Void receipt?') ) {
            def reason = MsgBox.prompt('Enter reason for voiding the receipt:')
            if( !"null".equalsIgnoreCase( reason ) ){
                CommonUtil.required( 'Reason', reason )
                entity = svc.voidReceipt( entity.objid, reason.toUpperCase() )   
                invokeNewHandler()
                invokeUpdateHandler()
            }
        }      
    }
    
    def  doVoid() {
        voidReceipt()
        return '_close'
    }
    
    def doDelete() {
        delete()
        return '_close'
    }   
    
    void delete() {
        if( MsgBox.confirm('Delete receipt?') ) {
            def reason = MsgBox.prompt('Enter reason for deleting the receipt:')
            CommonUtil.required('Reason', reason)
            svc.delete( entity.objid, reason.toUpperCase() )    
            invokeNewHandler()
            invokeDeleteHandler()
        }        
    }
    
    def onselectEntity = { se ->
        entity.info.payorid   = se.objid
        entity.info.payorname = se.entityname
        entity.info.payoraddress = se.entityaddress
        entity.info.paidby = entity.info.payorname
        entity.info.paidbyaddress = entity.info.payoraddress
        binding.refresh( 'entity.info.*')
    }
        
    def lookupEntity() {
        return InvokerUtil.lookupOpener('entity.lookup', [onselect:onselectEntity, searchText:entity.info.payorname])
    }
    
    // referenced by XLookupField 
    def getLookupEntity2() {
        return InvokerUtil.lookupOpener('entity.lookup', [:])
    }
    
    void setPayor( se ) {
        this.payor = se 
        entity.info.payorid   = se?.objid
        entity.info.payorname = se?.entityname
        entity.info.payoraddress = se?.entityaddress
        entity.info.paidby = entity.info.payorname
        entity.info.paidbyaddress = entity.info.payoraddress
        binding.refresh( 'entity.info.*')
    }
            
    void resetItemIncomeAcctInfo() {
        entity.items.each { it.acct = null }
    }

    def createEntity() {
        return [
            objid       : 'RCT' + new UID(),
            docstate    : initState(),
            opener      : openerType,
            voided      : 0,
            collectorid : afcontrol.collectorid,
            info     : [
                mode             : txnmode,
                afid             : af.objid,
                aftype           : af.aftype,
                afcontrolid      : afcontrol.objid,
                series           : afcontrol.currentseries,
                serialno         : afcontrol.serialno,
                stubno           : afcontrol.stubno,
                collectiontypeid : collectiontype.objid,
                collectiontype   : collectiontype.name,
                payorrequired    : collectiontype.payorrequired,
                collectorid      : afcontrol.collectorid,
                collectorname    : afcontrol.collectorname,
                collectortitle   : afcontrol.collectortitle,
                capturedbyid     : subcollector?.objid,
                capturedbyname   : subcollector?.name,
                capturedbytitle  : subcollector?.jobtitle,
                amount       : 0.00,
                totalpayment : 0.00,
                cash         : 0.00,
                otherpayment : 0.00,
                change       : 0.00,
            ],
            items    : [],
            payments : [],
        ]
    }
    
    def initState() {
        if( txnmode == CAPTURE_MODE)
            return CAPTURED_STATE
        if( subcollector ) return DELEGATED_STATE;

        return OPEN_STATE
    }
    
    void updatePaymentInfo( payments ) {
        calculateTotalPayment(payments)
        calculateTotalOtherPayment( payments )
        calculateTotalCashPayment( payments )
        calculateChange()
        entity.payments.clear()
        entity.payments.addAll( payments )
    } 
    
    void calculateTotalPayment( payments ) {
        entity.info.totalpayment = CommonUtil.sum( payments, {it.amount} )
    }
    
    void calculateTotalOtherPayment( payments ) {
        def list = payments.findAll{ it.paytype != 'CASH' }
        entity.info.otherpayment = CommonUtil.sum( list, {it.amount} )
    }
    
    void calculateTotalCashPayment( payments ) {
        def list = payments.findAll{ it.paytype == 'CASH' }
        entity.info.cash = CommonUtil.sum( list, {it.amount} )
    }

    def calculateAmountDue() {
        return CommonUtil.sum( entity.items, {it.amount} )
    }

    void calculateChange() {
        entity.info.change = 0.0
        if( entity.info.amount < entity.info.totalpayment ) {
            entity.info.change = entity.info.totalpayment - entity.info.amount
            entity.info.cash = entity.info.totalpayment - entity.info.otherpayment - entity.info.change
        }
    }
 
    def updatePaymentHandler = { payments ->
        updatePaymentInfo( payments )
        binding.refresh( 'entity.info.*' )
    }
        
    def paymentSummary = InvokerUtil.lookupOpener('paymentsummary', [updatePaymentHandler:updatePaymentHandler])

    void reinitializePaymentSummary() {
        def payments = []
        payments.addAll( entity.payments )
        paymentSummary = InvokerUtil.lookupOpener('paymentsummary', [updatePaymentHandler:updatePaymentHandler, payments:payments])
    }
    
    def getHtml() {
        return htmlService.getHtml( entity.objid ) 
    }

    def getAmount() {
        return CommonUtil.formatNumber( '#,##0.00', entity.info.amount )
    }

    def getTotalpayment() {
        return CommonUtil.formatNumber( '#,##0.00', entity.info.totalpayment )
    }

    def getChange() {
        return CommonUtil.formatNumber( '#,##0.00', entity.info.change )
    }
    
    void invokeNewHandler() {
        if( newHandler ) newHandler()
    }
    
    void invokeUpdateHandler() {
        if( updateHandler ) updateHandler( entity )
    }
    
    void invokeDeleteHandler() {
        if( deleteHandler ) deleteHandler( entity )
    }
    
}