/*
 * TransimttalInitPage.java
 *
 * Created on January 24, 2011, 10:59 AM
 */

package etracs2.municipality.transmittal;

/**
 *
 * @author  prmf
 */
public class TransmittalInitPage extends javax.swing.JPanel {
    
    /** Creates new form TransimttalInitPage */
    public TransmittalInitPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        xLabel5 = new com.rameses.rcp.control.XLabel();
        jPanel3 = new javax.swing.JPanel();
        xActionBar2 = new com.rameses.rcp.control.XActionBar();
        jPanel4 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        xTextArea1 = new com.rameses.rcp.control.XTextArea();
        jPanel5 = new javax.swing.JPanel();
        xTable1 = new com.rameses.rcp.control.XTable();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(674, 478));
        jPanel1.setLayout(new java.awt.BorderLayout());

        xLabel5.setBackground(new java.awt.Color(0, 51, 153));
        xLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        xLabel5.setForeground(new java.awt.Color(255, 255, 255));
        xLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        xLabel5.setName("title");
        xLabel5.setOpaque(true);
        jPanel1.add(xLabel5, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 1, 3, 1));
        jPanel3.setOpaque(false);
        xActionBar2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        xActionBar2.setName("formActions");
        jPanel3.add(xActionBar2, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.NORTH);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle(" Transimittal ");
        formPanel1.setBorder(xTitledBorder1);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 70));
        xTextArea1.setColumns(20);
        xTextArea1.setRows(5);
        xTextArea1.setCaption("Remarks");
        xTextArea1.setCaptionWidth(75);
        xTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        xTextArea1.setName("bean.remarks");
        xTextArea1.setPreferredSize(new java.awt.Dimension(300, 19));
        xTextArea1.setTextCase(com.rameses.rcp.constant.TextCase.UPPER);
        jScrollPane1.setViewportView(xTextArea1);

        formPanel1.add(jScrollPane1);

        jPanel5.setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Tax Declarations");
        jPanel5.setBorder(xTitledBorder2);
        xTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        xTable1.setHandler("listHandler");
        jPanel5.add(xTable1, java.awt.BorderLayout.CENTER);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, formPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addContainerGap())
        );
        add(jPanel4, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private com.rameses.rcp.control.XActionBar xActionBar2;
    private com.rameses.rcp.control.XLabel xLabel5;
    private com.rameses.rcp.control.XTable xTable1;
    private com.rameses.rcp.control.XTextArea xTextArea1;
    // End of variables declaration//GEN-END:variables
    
}
