/*
 * AFControlSerialPage.java
 *
 * Created on August 19, 2011, 8:06 AM
 */

package etracs2.tc.af;

import com.rameses.rcp.ui.annotations.StyleSheet;

/**
 *
 * @author  jzamora
 */
@StyleSheet("etracs2/tc/af/AFControlNonSerialPage.style")
public class AFControlNonSerialPage extends javax.swing.JPanel {
    
    /** Creates new form AFControlSerialPage */
    public AFControlNonSerialPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xComboBox3 = new com.rameses.rcp.control.XComboBox();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xSeparator1 = new com.rameses.rcp.control.XSeparator();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xSeparator2 = new com.rameses.rcp.control.XSeparator();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();
        xNumberField2 = new com.rameses.rcp.control.XNumberField();
        xNumberField3 = new com.rameses.rcp.control.XNumberField();
        xActionBar1 = new com.rameses.rcp.control.XActionBar();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Serial Accountable Form Information");
        formPanel1.setBorder(xTitledBorder1);
        xLabel1.setCaption("State");
        xLabel1.setCaptionWidth(105);
        xLabel1.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel1.setName("afcontrol.docstate");
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 16));
        formPanel1.add(xLabel1);

        xComboBox3.setCaption("Collector");
        xComboBox3.setCaptionWidth(105);
        xComboBox3.setExpression("#{name}");
        xComboBox3.setImmediate(true);
        xComboBox3.setItems("collectorlist");
        xComboBox3.setName("collector");
        xComboBox3.setPreferredSize(new java.awt.Dimension(0, 22));
        xComboBox3.setRequired(true);
        formPanel1.add(xComboBox3);

        xComboBox1.setCaption("AF No.");
        xComboBox1.setCaptionWidth(105);
        xComboBox1.setDynamic(true);
        xComboBox1.setExpression("#{objid}");
        xComboBox1.setImmediate(true);
        xComboBox1.setItems("aflist");
        xComboBox1.setName("af");
        xComboBox1.setPreferredSize(new java.awt.Dimension(150, 21));
        xComboBox1.setRequired(true);
        formPanel1.add(xComboBox1);

        xComboBox2.setCaption("Mode");
        xComboBox2.setCaptionWidth(105);
        xComboBox2.setDynamic(true);
        xComboBox2.setItems("modelist");
        xComboBox2.setName("afcontrol.mode");
        xComboBox2.setPreferredSize(new java.awt.Dimension(150, 21));
        xComboBox2.setRequired(true);
        formPanel1.add(xComboBox2);

        xDateField1.setCaption("Date Issued");
        xDateField1.setCaptionWidth(105);
        xDateField1.setName("afcontrol.dtissued");
        xDateField1.setPreferredSize(new java.awt.Dimension(150, 19));
        xDateField1.setRequired(true);
        formPanel1.add(xDateField1);

        xSeparator1.setPreferredSize(new java.awt.Dimension(0, 20));
        org.jdesktop.layout.GroupLayout xSeparator1Layout = new org.jdesktop.layout.GroupLayout(xSeparator1);
        xSeparator1.setLayout(xSeparator1Layout);
        xSeparator1Layout.setHorizontalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 397, Short.MAX_VALUE)
        );
        xSeparator1Layout.setVerticalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );
        formPanel1.add(xSeparator1);

        xTextField1.setCaption("Stub No.");
        xTextField1.setCaptionWidth(105);
        xTextField1.setName("afcontrol.stubno");
        xTextField1.setPreferredSize(new java.awt.Dimension(150, 19));
        xTextField1.setRequired(true);
        formPanel1.add(xTextField1);

        xSeparator2.setPreferredSize(new java.awt.Dimension(0, 20));
        org.jdesktop.layout.GroupLayout xSeparator2Layout = new org.jdesktop.layout.GroupLayout(xSeparator2);
        xSeparator2.setLayout(xSeparator2Layout);
        xSeparator2Layout.setHorizontalGroup(
            xSeparator2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 397, Short.MAX_VALUE)
        );
        xSeparator2Layout.setVerticalGroup(
            xSeparator2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );
        formPanel1.add(xSeparator2);

        xNumberField1.setCaption("Qty. Received");
        xNumberField1.setCaptionWidth(105);
        xNumberField1.setFieldType(Integer.class);
        xNumberField1.setName("qtyreceived");
        xNumberField1.setPreferredSize(new java.awt.Dimension(150, 19));
        xNumberField1.setRequired(true);
        formPanel1.add(xNumberField1);

        xNumberField2.setCaption("Qty. Issued");
        xNumberField2.setCaptionWidth(105);
        xNumberField2.setFieldType(Integer.class);
        xNumberField2.setName("qtyissued");
        xNumberField2.setPreferredSize(new java.awt.Dimension(150, 19));
        xNumberField2.setRequired(true);
        formPanel1.add(xNumberField2);

        xNumberField3.setCaption("Balance");
        xNumberField3.setCaptionWidth(105);
        xNumberField3.setEnabled(false);
        xNumberField3.setFieldType(Integer.class);
        xNumberField3.setName("afcontrol.balance");
        xNumberField3.setPreferredSize(new java.awt.Dimension(150, 19));
        xNumberField3.setRequired(true);
        formPanel1.add(xNumberField3);

        xActionBar1.setBorder(new com.rameses.rcp.control.border.XUnderlineBorder());
        xActionBar1.setName("formActions");
        xActionBar1.setPadding(new java.awt.Insets(3, 3, 0, 0));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(xActionBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 411, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(xActionBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 357, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XComboBox xComboBox3;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XNumberField xNumberField1;
    private com.rameses.rcp.control.XNumberField xNumberField2;
    private com.rameses.rcp.control.XNumberField xNumberField3;
    private com.rameses.rcp.control.XSeparator xSeparator1;
    private com.rameses.rcp.control.XSeparator xSeparator2;
    private com.rameses.rcp.control.XTextField xTextField1;
    // End of variables declaration//GEN-END:variables
    
}