/*
 * ChangeTradenamePage.java
 *
 * Created on June 6, 2011, 5:36 PM
 */

package etracs2.bp.transaction.changetradename;

import com.rameses.rcp.ui.annotations.StyleSheet;

/**
 *
 * @author  user
 */
@StyleSheet("etracs2/bp/transaction/TransactionPage.style")
public class ChangeTradenamePage extends javax.swing.JPanel {
    
    /** Creates new form ChangeTradenamePage */
    public ChangeTradenamePage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        formPanel3 = new com.rameses.rcp.util.FormPanel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        xLabel5 = new com.rameses.rcp.control.XLabel();
        xLabel6 = new com.rameses.rcp.control.XLabel();
        xLabel7 = new com.rameses.rcp.control.XLabel();
        xLabel8 = new com.rameses.rcp.control.XLabel();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(677, 379));
        xActionBar1.setName("formActions");
        add(xActionBar1, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Transaction Information");
        jPanel2.setBorder(xTitledBorder1);

        xLabel2.setCaption("Transaction No.");
        xLabel2.setCaptionFont(new java.awt.Font("Tahoma", 0, 14));
        xLabel2.setCaptionWidth(120);
        xLabel2.setExpression("#{entity.info.txnno}");
        xLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel2);

        jPanel2.add(formPanel1);
        formPanel1.setBounds(10, 20, 390, 30);

        xLabel1.setForeground(new java.awt.Color(255, 0, 0));
        xLabel1.setCaption("State");
        xLabel1.setCaptionFont(new java.awt.Font("Tahoma", 0, 14));
        xLabel1.setExpression("#{entity.docstate}");
        xLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xLabel1);

        jPanel2.add(formPanel2);
        formPanel2.setBounds(400, 20, 250, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 660, 60);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Business Information");
        formPanel3.setBorder(xTitledBorder2);
        formPanel3.setPadding(new java.awt.Insets(5, 10, 5, 10));
        xTextField1.setCaption("New Tradename");
        xTextField1.setCaptionWidth(100);
        xTextField1.setName("entity.info.newtradename");
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField1.setRequired(true);
        formPanel3.add(xTextField1);

        xLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("TextField.shadow")));
        xLabel3.setCaption("Prev. Tradename");
        xLabel3.setCaptionWidth(100);
        xLabel3.setExpression("#{entity.business.tradename}");
        xLabel3.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel3.add(xLabel3);

        xLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("TextField.shadow")));
        xLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        xLabel4.setCaption("Address");
        xLabel4.setCaptionWidth(100);
        xLabel4.setExpression("#{entity.business.businessaddress}");
        xLabel4.setPreferredSize(new java.awt.Dimension(0, 36));
        formPanel3.add(xLabel4);

        xLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("TextField.shadow")));
        xLabel5.setCaption("Owner Name");
        xLabel5.setCaptionWidth(100);
        xLabel5.setExpression("#{entity.business.taxpayername}");
        xLabel5.setPreferredSize(new java.awt.Dimension(0, 16));
        formPanel3.add(xLabel5);

        xLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("TextField.shadow")));
        xLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        xLabel6.setCaption("Owner Address");
        xLabel6.setCaptionWidth(100);
        xLabel6.setExpression("#{entity.business.taxpayeraddress}");
        xLabel6.setPreferredSize(new java.awt.Dimension(0, 36));
        formPanel3.add(xLabel6);

        xLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("TextField.shadow")));
        xLabel7.setCaption("Admin Name");
        xLabel7.setCaptionWidth(100);
        xLabel7.setExpression("#{entity.business.adminname}");
        xLabel7.setPreferredSize(new java.awt.Dimension(0, 16));
        formPanel3.add(xLabel7);

        xLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("TextField.shadow")));
        xLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        xLabel8.setCaption("Admin Address");
        xLabel8.setCaptionWidth(100);
        xLabel8.setExpression("#{entity.business.adminaddress}");
        xLabel8.setPreferredSize(new java.awt.Dimension(0, 36));
        formPanel3.add(xLabel8);

        jPanel1.add(formPanel3);
        formPanel3.setBounds(10, 80, 660, 240);

        add(jPanel1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private com.rameses.rcp.util.FormPanel formPanel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XLabel xLabel5;
    private com.rameses.rcp.control.XLabel xLabel6;
    private com.rameses.rcp.control.XLabel xLabel7;
    private com.rameses.rcp.control.XLabel xLabel8;
    private com.rameses.rcp.control.XTextField xTextField1;
    // End of variables declaration//GEN-END:variables
    
}
