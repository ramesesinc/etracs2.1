/*
 * tPreviewPage.java
 *
 * Created on January 13, 2011, 3:09 PM
 */

package etracs2.tc.liquidation;

/**
 *
 * @author  jzamss
 */
public class LiquidationReportCPage extends javax.swing.JPanel {
    
    /** Creates new form tPreviewPage */
    public LiquidationReportCPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        xReportPanel1 = new com.rameses.osiris2.reports.ui.XReportPanel();
        jPanel1 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(new java.awt.BorderLayout());

        xReportPanel1.setDepends(new String[] {"fund", "chart"});
        xReportPanel1.setName("report");
        org.jdesktop.layout.GroupLayout xReportPanel1Layout = new org.jdesktop.layout.GroupLayout(xReportPanel1);
        xReportPanel1.setLayout(xReportPanel1Layout);
        xReportPanel1Layout.setHorizontalGroup(
            xReportPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 604, Short.MAX_VALUE)
        );
        xReportPanel1Layout.setVerticalGroup(
            xReportPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 311, Short.MAX_VALUE)
        );
        add(xReportPanel1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.BorderLayout());

        formPanel1.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        xComboBox1.setAllowNull(false);
        xComboBox1.setCaption("Chart");
        xComboBox1.setDynamic(true);
        xComboBox1.setImmediate(true);
        xComboBox1.setItems("chartList");
        xComboBox1.setName("chart");
        xComboBox1.setPreferredSize(new java.awt.Dimension(150, 22));
        xComboBox1.setRequired(true);
        formPanel1.add(xComboBox1);

        xComboBox2.setAllowNull(false);
        xComboBox2.setCaption("Fund");
        xComboBox2.setDynamic(true);
        xComboBox2.setExpression("#{fundname}");
        xComboBox2.setImmediate(true);
        xComboBox2.setItems("fundList");
        xComboBox2.setName("fund");
        xComboBox2.setRequired(true);
        formPanel1.add(xComboBox2);

        jPanel1.add(formPanel1, java.awt.BorderLayout.SOUTH);

        xActionBar1.setBorder(new com.rameses.rcp.control.border.XUnderlineBorder());
        xActionBar1.setName("formActions");
        jPanel1.add(xActionBar1, java.awt.BorderLayout.NORTH);

        jPanel1.add(jSeparator1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.NORTH);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.osiris2.reports.ui.XReportPanel xReportPanel1;
    // End of variables declaration//GEN-END:variables
    
}