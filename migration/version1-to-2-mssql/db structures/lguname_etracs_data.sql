/*Data for the table "orgtype" */

insert  into "orgtype"("name") values ('ADMIN_UNIT'),('BARANGAY');

/*Data for the table "orgunit" */

insert  into "orgunit"("objid","code","title","orgtype","parentid","system","reftype","refid") values ('AC','AC','ACCOUNTING DEPARTMENT','ADMIN_UNIT',NULL,1,NULL,NULL),('AO','AO','ASSESSOR''S OFFICE','ADMIN_UNIT',NULL,1,NULL,NULL),('BPLO','BPLO','BUSINESS PERMIT LICENSING OFFICE','ADMIN_UNIT',NULL,1,NULL,NULL),('HR','HR','HR DEPARTMENT','ADMIN_UNIT',NULL,1,NULL,NULL),('IT','IT','IT DEPARTMENT','ADMIN_UNIT',NULL,1,NULL,NULL),('TR','TR','TREASURY DEPARTMENT','ADMIN_UNIT',NULL,1,NULL,NULL);

/*Data for the table "role" */

insert  into "role"("name","description","roleclass","included","system") values ('ACCOUNTING_DEFAULT','ACCOUNTING_DEFAULT','ACCOUNTING','["tc2:account\\..*","tc2:bank\\..*","tc2:bankacct\\..*","tc2:collectionsetting\\..*","tc2:collectiontype\\..*","tc2:fund\\..*","tc2:incomeacct\\..*","tc2:incomeacctgroup\\..*","tc2:tcmanagement.open","tc2:tcreport.incomeaccount"]',1),('ADMIN_DEFAULT','ADMIN_DEFAULT','ADMIN','[".*"]',1),('AFO','AFO','TREASURY','["tc2:af\\..*","tc2:afcontrol\\..*","tc2:afinventory\\..*","tc2:iraf\\..*","tc2:riv_lgu\\..*","tc2:riv\\..*"]',0),('ASSESSOR','ASSESSOR','RPT','["etracs2-entity:.*","rpt2:rpttransaction\\..*","rpt2:consolidationmgt\\..*","rpt2:datacapture\\..*","rpt2:transfer\\..*","rpt2:reassessment\\..*","rpt2:correction\\..*","rpt2:newdiscovery\\..*","rpt2:multipleclaim\\..*","rpt2:cancelfaasmgt\\..*","rpt2:cancelfaas\\..*","rpt2:faasmgt\\..*","rpt2:faas\\..*","rpt2:subdivision\\..*","rpt2:subdivisionmgt\\..*","rpt2:truecopy\\..*","rpt2:rptcertification_list\\..*","rpt2:rptcertifications\\..*","rpt2:noproperty\\..*","rpt2:landholding\\..*","rpt2:multipleproperty\\..*","rpt2:noimprovement\\..*","rpt2:noimprovementbytdno\\..*","rpt2:latestexistproperty\\..*","rpt2:withimproveland\\..*","rpt2:wimprovebytdno\\..*","rpt2:rptreport\\..*","rpt2:rptreportmgmt\\..*","rpt2:rptmanagement\\..*","rpt2:rysetting\\..*","rpt2:propertyclassification\\..*","rpt2:exemptiontypes\\..*","rpt2:kindofbldg\\..*","rpt2:materials\\..*","rpt2:structures\\..*","rpt2:structuretemplates\\..*","rpt2:machines\\..*","rpt2:plantstrees\\..*","rpt2:miscitems\\..*","rpt2:rptofficers\\..*","rpt2:canceltdreasons\\..*","rpt2:txnrequirements\\..*","rpt2:rptparameters\\..*","rpt2:rptsetting\\..*","rpt2:annotationmgmt\\..*","rpt2:annotation\\..*","rpt2:cancelannotationmgmt\\..*","rpt2:cancelannotation\\..*","rpt2:mortgage\\..*","rpt2:bailbond\\..*","rpt2:other\\..*"]',0),('ASSESSOR_CERTIFICATION','ASSESSOR_CERTIFICATION','RPT','["rpt2:truecopy\\..*","rpt2:rptcertification_list\\..*","rpt2:rptcertifications\\..*","rpt2:noproperty\\..*","rpt2:landholding\\..*","rpt2:multipleproperty\\..*","rpt2:noimprovement\\..*","rpt2:noimprovementbytdno\\..*","rpt2:latestexistproperty\\..*","rpt2:withimproveland\\..*","rpt2:wimprovebytdno\\..*"]',NULL),('ASSESSOR_REPORTS','ASSESSOR_REPORTS','RPT','["rpt2:rptreport\\..*","rpt2:rptreportmgmt\\..*"]',NULL),('BP_ADMIN','BP_ADMIN','BP','["bp2:bpadmin\\..*","bp2:bpbillingrules\\..*","bp2:bpassessmentrule\\..*","bp2:bpbilling\\..*","bp2:bpmanagement\\..*","bp2:bplicensing\\..*","bp2:bptransaction\\..*","bp2:bpreportmgmt\\..*","bp2:bpreport\\..*","bp2:bppermit\\..*","etracs2common:rule\\..*"]',NULL),('BP_COLLECTION_ASSESSMENT','bp collection/assessment','TREASURY','["bp-rule-mgmt:.*","bp2:.*","ctc-rule-mgmt:.*","ctc2:.*","etracs2-entity:.*","tc2:af\\..*","tc2:afcontrol\\..*","tc2:bank\\..*","tc2:bankacct\\..*","tc2:batchcapture\\..*","tc2:batchcapturemgmt\\..*","tc2:collection\\..*","tc2:collection_burial\\..*","tc2:collection_cashticket\\..*","tc2:collection_cattleownership\\..*","tc2:collection_cattletransfer\\..*","tc2:collection_general\\..*","tc2:collection_marriage\\..*","tc2:collection_slaughterpermit\\..*","tc2:collectionsetting\\..*","tc2:collectiontype\\..*","tc2:fund\\..*","tc2:incomeacct\\..*","tc2:incomeacctgroup\\..*","tc2:postcapturereceipt\\..*","tc2:receipt\\..*","tc2:remittance\\..*","tc2:riv\\..*","tc2:riv_lgu\\..*","tc2:tcmanagement\\..*","tc2:tcreport\\..*","tc2:treasurymgmt\\..*","tc2:treasurymgmt_abstract\\..*","tc2:treasurymgmt_afmonitoring\\..*","tc2:treasurymgmt_collection\\..*","tc2:treasurymgmt_fund\\..*","tc2:treasurymgmt_liquidation\\..*","tc2:treasurymgmt_remittance\\..*"]',NULL),('BP_DEFAULT','default bp role','BP',NULL,NULL),('BP_LICENSING','BP_LICENSING','BP','["bp2:bpbillingrules\\..*","bp2:bpbilling\\..*","bp2:bpmanagement\\..*","bp2:bplicensing\\..*","bp2:bptransaction\\..*","bp2:bpreportmgmt\\..*","bp2:bpreport\\..*","bp2:bppermit\\..*","etracs2-entity:.*"]',NULL),('BP_PERMIT','BP_PERMIT','BP','["bp2:bpmanagement\\..*","bp2:bplicensing\\..*","bp2:bptransaction\\..*","bp2:bpreportmgmt\\..*","bp2:bpreport\\..*","bp2:bppermit\\..*","etracs2-entity:.*"]',NULL),('CASHIER','CASHIER','TREASURY','["tc2:bank\\..*","tc2:bankacct\\..*","tc2:fund\\..*","tc2:deposit\\..*","tc2:treasurymgmt_fund\\..*"]',NULL),('CITY_TREASURER','CITY TREASURER','TREASURY','["bp2:bpbilling\\..*","bp2:bplicensing\\.(applicationlist|viewapplication|viewassessment)","bp2:bppermit\\..*","bp2:bpreport\\..*","bp2:bpreportmgmt\\..*","bp2:bptransaction\\..*","rpt2:landtax\\..*","rpt2:rptbilling\\..*","rpt2:rptcertification_list\\..*","rpt2:rptcertifications\\..*","rpt2:rptledger\\.(previewbill|printbill|view)","rpt2:rptofficers\\.(view)","rpt2:rptparameters\\.(view)","tc2:account\\.(view)","tc2:af\\.(viewlist)","tc2:bank\\.(view)","tc2:bankacct\\.(view)","tc2:fund\\.(viewlist)","tc2:incomeacct\\.(viewlist)","tc2:incomeacctgroup\\.(viewlist)","tc2:liquidation\\.(viewlist)","tc2:receipt\\.(viewissued|viewissued)","tc2:remittance\\.(viewlist)","tc2:tcreport\\..*","tc2:treasurymgmt\\..*","tc2:treasurymgmt_abstract\\..*","tc2:treasurymgmt_afmonitoring\\..*","tc2:treasurymgmt_collection\\..*","tc2:treasurymgmt_fund\\..*","tc2:treasurymgmt_liquidation\\..*","tc2:treasurymgmt_remittance\\..*"]',NULL),('COLLECTION_LIQUIDATION_DEPOSIT','COLLECTION_LIQUIDATION_DEPOSIT','TREASURY','["tc2:afcontrol\\..*","tc2:bank\\..*","tc2:bankacct\\..*","tc2:batchcapture\\..*","tc2:batchcapturemgmt\\..*","tc2:collection\\..*","tc2:collection_burial\\..*","tc2:collection_cashticket\\..*","tc2:collection_cattleownership\\..*","tc2:collection_cattletransfer\\..*","tc2:collection_general\\..*","tc2:collection_marriage\\..*","tc2:collection_slaughterpermit\\..*","tc2:collectionsetting\\..*","tc2:collectiontype\\..*","tc2:deposit\\..*","tc2:fund\\..*","tc2:incomeacct\\..*","tc2:incomeacctgroup\\..*","tc2:liquidation\\..*","tc2:postcapturereceipt\\..*","tc2:receipt\\..*","tc2:remittance\\..*","tc2:tcmanagement\\..*","tc2:tcreport\\..*","tc2:treasurymgmt\\..*","tc2:treasurymgmt_abstract\\..*","tc2:treasurymgmt_collection\\..*","tc2:treasurymgmt_fund\\..*","tc2:treasurymgmt_liquidation\\..*","tc2:treasurymgmt_remittance\\..*"]',NULL),('COLLECTOR','COLLECTOR','TREASURY','["bp2:collection_bp\\..*","ctc2:.*","etracs2common:entity\\..*","etracs2common:individual\\..*","etracs2common:juridical\\..*","etracs2common:multiple\\..*","rpt2:landtax\\..*","tc2:collectionsetting\\..*","tc2:collectiontype\\..*","tc2:fund\\..*","tc2:incomeacct\\..*","tc2:incomeacctgroup\\..*","tc2:tcmanagement\\..*","tc2:afcontrol\\..*","tc2:collection\\..*","tc2:remittance\\..*","tc2:receipt\\..*","tc2:batchcapturemgmt\\..*","tc2:batchcapture\\..*","tc2:collection_burial\\..*","tc2:collection_cashticket\\..*","tc2:collection_cattleownership\\..*","tc2:collection_cattletransfer\\..*","tc2:collection_general\\..*","tc2:collection_marriage\\..*","tc2:postcapturereceipt\\..*","tc2:tcreport\\..*","tc2:collection_slaughterpermit\\..*","tc2:treasurymgmt_abstract\\..*","tc2:treasurymgmt_afmonitoring\\..*","tc2:treasurymgmt_collection\\..*","tc2:treasurymgmt_fund\\..*","tc2:treasurymgmt_liquidation\\..*","tc2:treasurymgmt_remittance\\..*","tc2:riv_lgu\\..*","tc2:riv\\..*"]',NULL),('CTC_ADMIN','ctc admin','TREASURY','["ctc-rule-mgmt:.*"]',NULL),('FACULTY_DEFAULT','FACULTY_DEFAULT','FACULTY','[ ''.*'' ]',1),('IT_DEFAULT','IT_DEFAULT','IT','[ ''.*'' ]',1),('LANDTAX','LANDTAX','RPT','["etracs2-entity:.*","etracs2common:rule\\..*","rpt2:truecopy\\..*","rpt2:rptcertification_list\\..*","rpt2:rptcertifications\\..*","rpt2:noproperty\\..*","rpt2:landholding\\..*","rpt2:multipleproperty\\..*","rpt2:noimprovement\\..*","rpt2:noimprovementbytdno\\..*","rpt2:latestexistproperty\\..*","rpt2:withimproveland\\..*","rpt2:wimprovebytdno\\..*","rpt2:rptreport\\..*","rpt2:rptreportmgmt\\..*","rpt2:rptbilling\\..*","rpt2:rptledger\\..*","rpt2:propertypayer\\..*","rpt2:rptbillingrule\\..*","rpt2:landtax\\..*","rpt2:rptmanagement\\..*","rpt2:rptparameters\\..*","rpt2:rptsetting\\..*"]',NULL),('LIQUIDATING_OFFICER','Liquidating officer role.','TREASURY','["tc2:fund\\..*","tc2:tcmanagement\\..*","tc2:tcreport\\..*","tc2:liquidation\\..*","tc2:treasurymgmt_liquidation\\..*"]',NULL),('RPT_ADMIN','RPT_ADMIN','RPT','["etracs2-entity:.*","rpt2:.*"]',NULL),('RPT_APPRAISER','RPT_APPRAISER','RPT','["etracs2-entity:.*","rpt2:rpttransaction\\..*","rpt2:consolidation\\..*","rpt2:consolidationmgt\\..*","rpt2:datacapture\\.(create)","rpt2:transfer\\..*","rpt2:reassessment\\..*","rpt2:correction\\..*","rpt2:newdiscovery\\..*","rpt2:multipleclaim\\..*","rpt2:cancelfaasmgt\\..*","rpt2:cancelfaas\\..*","rpt2:faasmgt\\..*","rpt2:faas\\..*","rpt2:subdivision\\..*","rpt2:subdivisionmgt\\..*","rpt2:truecopy\\..*"]',0),('RPT_DEFAULT','default  rpt role','RPT',NULL,NULL),('RULE_AUTHOR','RULE_AUTHOR','BP','["bp-rule-mgmt:.*","bp2:bpadmin\\..*","bp2:bpassessmentrule\\..*","bp2:bpbilling\\..*","bp2:bpbillingrules\\..*","bp2:bplicensing\\..*","bp2:bpmanagement\\..*","bp2:bpreportmgmt\\..*"]',NULL),('SUBCOLLECTOR','SUBCOLLECTOR','TREASURY','["bp2:collection_bp\\..*","etracs2common:entity\\..*","etracs2common:individual\\..*","etracs2common:juridical\\..*","etracs2common:multiple\\..*","rpt2:landtax\\..*","tc2:collection\\.(create_capture)","tc2:receipt\\..*","tc2:batchcapturemgmt\\..*","tc2:batchcapture\\..*","tc2:collection_burial\\..*","tc2:collection_cashticket\\..*","tc2:collection_cattleownership\\..*","tc2:collection_cattletransfer\\..*","tc2:collection_general\\..*","tc2:collection_marriage\\..*","tc2:postcapturereceipt\\..*","tc2:collection_slaughterpermit\\..*"]',NULL),('TEST','test','TREASURY','["bp2:.*"]',NULL),('TREASURY_DEFAULT','TREASURY_DEFAULT','TREASURY','[".*"]',1);
