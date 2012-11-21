/*
 * RemittanceInitPage.java
 *
 * Created on May 2, 2011, 3:01 PM
 */

package etracs2.tc.remittance.subcollector;

import java.math.BigDecimal;

/**
 *
 * @author  alvin
 */
public class RemittancePage extends javax.swing.JPanel {
    
    /** Creates new form RemittanceInitPage */
    public RemittancePage() {
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
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(643, 466));
        xActionBar1.setButtonFont(new java.awt.Font("Arial", 1, 12));
        xActionBar1.setName("formActions");
        add(xActionBar1, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Remittance Initial Information");
        formPanel1.setBorder(xTitledBorder1);
        formPanel1.setPadding(new java.awt.Insets(10, 10, 5, 5));
        xTextField1.setCaption("Sub Collector");
        xTextField1.setCaptionWidth(120);
        xTextField1.setFont(new java.awt.Font("Arial", 1, 14));
        xTextField1.setName("entity.collectorname");
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 24));
        xTextField1.setReadonly(true);
        formPanel1.add(xTextField1);

        xDateField1.setCaption("Date");
        xDateField1.setCaptionWidth(120);
        xDateField1.setFont(new java.awt.Font("Arial", 1, 14));
        xDateField1.setName("entity.txndate");
        xDateField1.setPreferredSize(new java.awt.Dimension(120, 24));
        xDateField1.setRequired(true);
        formPanel1.add(xDateField1);

        xComboBox1.setAllowNull(false);
        xComboBox1.setCaption("Collector");
        xComboBox1.setCaptionWidth(120);
        xComboBox1.setExpression("#{collectorname}");
        xComboBox1.setFont(new java.awt.Font("Arial", 1, 14));
        xComboBox1.setImmediate(true);
        xComboBox1.setItems("collectorlist");
        xComboBox1.setName("remCollector");
        xComboBox1.setPreferredSize(new java.awt.Dimension(0, 26));
        xComboBox1.setRequired(true);
        formPanel1.add(xComboBox1);

        jPanel1.add(formPanel1);
        formPanel1.setBounds(10, 10, 550, 130);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Summary of Collections");
        xDataTable1.setBorder(xTitledBorder2);
        xDataTable1.setDepends(new String[] {"remCollector"});
        xDataTable1.setHandler("summaryHandler");
        jPanel1.add(xDataTable1);
        xDataTable1.setBounds(10, 140, 550, 246);

        formPanel2.setCaptionFont(new java.awt.Font("Arial", 1, 14));
        xNumberField1.setCaption("Total");
        xNumberField1.setCaptionWidth(60);
        xNumberField1.setFieldType(BigDecimal.class);
        xNumberField1.setFont(new java.awt.Font("Arial", 1, 14));
        xNumberField1.setName("remittanceAmount");
        xNumberField1.setPattern("#,##0.00");
        xNumberField1.setPreferredSize(new java.awt.Dimension(0, 24));
        xNumberField1.setReadonly(true);
        formPanel2.add(xNumberField1);

        jPanel1.add(formPanel2);
        formPanel2.setBounds(340, 390, 224, 44);

        add(jPanel1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private javax.swing.JPanel jPanel1;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XNumberField xNumberField1;
    private com.rameses.rcp.control.XTextField xTextField1;
    // End of variables declaration//GEN-END:variables
    
}
