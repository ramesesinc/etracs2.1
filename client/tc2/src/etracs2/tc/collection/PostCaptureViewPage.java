/*
 * PostCaptureViewPage.java
 *
 * Created on May 12, 2011, 10:34 AM
 */

package etracs2.tc.collection;

import java.math.BigDecimal;

/**
 *
 * @author  jzamora
 */
public class PostCaptureViewPage extends javax.swing.JPanel {
    
    /** Creates new form PostCaptureViewPage */
    public PostCaptureViewPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel2 = new javax.swing.JPanel();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xLabel3 = new com.rameses.rcp.control.XLabel();

        jPanel2.setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Summary of Posted Captured Collection");
        jPanel2.setBorder(xTitledBorder1);
        jPanel2.setPreferredSize(new java.awt.Dimension(204, 200));
        xDataTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 10, 5));
        xDataTable1.setHandler("summaryHandler");
        xDataTable1.setImmediate(true);
        xDataTable1.setName("selectedSummary");
        xDataTable1.setPreferredSize(new java.awt.Dimension(350, 80));
        jPanel2.add(xDataTable1, java.awt.BorderLayout.WEST);

        formPanel1.setCaption("");
        formPanel1.setCaptionBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        formPanel1.setEnabled(false);
        formPanel1.setName("entity.amount");
        formPanel1.setPadding(new java.awt.Insets(3, 5, 0, 0));
        formPanel1.setPreferredSize(new java.awt.Dimension(170, 30));
        xNumberField1.setCaption("Total Collection");
        xNumberField1.setCaptionWidth(90);
        xNumberField1.setFieldType(BigDecimal.class);
        xNumberField1.setFont(new java.awt.Font("Tahoma", 1, 14));
        xNumberField1.setForeground(new java.awt.Color(204, 0, 0));
        xNumberField1.setName("entity.amount");
        xNumberField1.setPattern("#,##0.00");
        xNumberField1.setPreferredSize(new java.awt.Dimension(125, 22));
        xNumberField1.setReadonly(true);
        formPanel1.add(xNumberField1);

        jPanel2.add(formPanel1, java.awt.BorderLayout.SOUTH);

        formPanel2.setPreferredSize(new java.awt.Dimension(132, 100));
        xLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel4.setForeground(new java.awt.Color(204, 0, 0));
        xLabel4.setCaption("State");
        xLabel4.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel4.setName("entity.docstate");
        xLabel4.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xLabel4);

        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel1.setCaption("Date Posted");
        xLabel1.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel1.setName("entity.dtposted");
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xLabel1);

        xLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel2.setCaption("Collector");
        xLabel2.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel2.setName("entity.collectorname");
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xLabel2);

        xLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel3.setCaption("Posted By");
        xLabel3.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel3.setName("entity.postedbyname");
        xLabel3.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xLabel3);

        jPanel2.add(formPanel2, java.awt.BorderLayout.NORTH);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 506, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 384, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private javax.swing.JPanel jPanel2;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XNumberField xNumberField1;
    // End of variables declaration//GEN-END:variables
    
}