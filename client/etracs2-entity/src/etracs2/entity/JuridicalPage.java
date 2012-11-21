/*
 * AccountPage.java
 *
 * Created on February 27, 2011, 12:48 PM
 */

package etracs2.entity;

import com.rameses.rcp.ui.annotations.StyleSheet;

/**
 *
 * @author  jzamss
 */
@StyleSheet("etracs2/entity/JuridicalPage.style")
public class JuridicalPage extends javax.swing.JPanel {
    
    /** Creates new form AccountPage */
    public JuridicalPage() {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField4 = new com.rameses.rcp.control.XTextField();
        xTextField5 = new com.rameses.rcp.control.XTextField();
        xTextField10 = new com.rameses.rcp.control.XTextField();
        xSeparator1 = new com.rameses.rcp.control.XSeparator();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xTextField6 = new com.rameses.rcp.control.XTextField();
        xTextField8 = new com.rameses.rcp.control.XTextField();
        xTextField9 = new com.rameses.rcp.control.XTextField();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(748, 396));
        xActionBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        xActionBar1.setName("formActions");
        add(xActionBar1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Document");
        jPanel2.setBorder(xTitledBorder1);
        jPanel2.setPreferredSize(new java.awt.Dimension(676, 455));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 5, 5));

        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel1.setForeground(new java.awt.Color(204, 0, 0));
        xLabel1.setCaption("Account No.");
        xLabel1.setCaptionWidth(115);
        xLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        xLabel1.setName("entity.entityno");
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel1);

        xTextField1.setCaption("Juridical Name");
        xTextField1.setCaptionWidth(115);
        xTextField1.setIndex(-10);
        xTextField1.setName("entity.entityname");
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField1.setRequired(true);
        formPanel1.add(xTextField1);

        xTextField4.setCaption("Address");
        xTextField4.setCaptionWidth(115);
        xTextField4.setName("entity.entityaddress");
        xTextField4.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField4.setRequired(true);
        formPanel1.add(xTextField4);

        xTextField5.setCaption("Mailing Address");
        xTextField5.setCaptionWidth(115);
        xTextField5.setName("entity.info.mailingaddress");
        xTextField5.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xTextField5);

        xTextField10.setCaption("Contact No.");
        xTextField10.setCaptionWidth(115);
        xTextField10.setName("entity.info.contactno");
        xTextField10.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xTextField10);

        xSeparator1.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel1.add(xSeparator1);

        xDateField1.setCaption("Date Registered");
        xDateField1.setCaptionWidth(115);
        xDateField1.setName("entity.info.dtregistered");
        xDateField1.setPreferredSize(new java.awt.Dimension(120, 19));
        formPanel1.add(xDateField1);

        xComboBox1.setCaption("Kind of Organization");
        xComboBox1.setCaptionWidth(115);
        xComboBox1.setItems("organizationTypes");
        xComboBox1.setName("entity.info.orgtype");
        xComboBox1.setPreferredSize(new java.awt.Dimension(0, 22));
        formPanel1.add(xComboBox1);

        xTextField6.setCaption("TIN");
        xTextField6.setCaptionWidth(115);
        xTextField6.setName("entity.info.tin");
        xTextField6.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xTextField6);

        xTextField8.setCaption("Nature of Business");
        xTextField8.setCaptionWidth(115);
        xTextField8.setName("entity.info.nature");
        xTextField8.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xTextField8);

        xTextField9.setCaption("Remarks");
        xTextField9.setCaptionWidth(115);
        xTextField9.setName("entity.info.remarks");
        xTextField9.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xTextField9);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 423, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 249, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XSeparator xSeparator1;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField10;
    private com.rameses.rcp.control.XTextField xTextField4;
    private com.rameses.rcp.control.XTextField xTextField5;
    private com.rameses.rcp.control.XTextField xTextField6;
    private com.rameses.rcp.control.XTextField xTextField8;
    private com.rameses.rcp.control.XTextField xTextField9;
    // End of variables declaration//GEN-END:variables
    
}