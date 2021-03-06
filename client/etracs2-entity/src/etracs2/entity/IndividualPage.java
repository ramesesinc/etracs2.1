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
@StyleSheet("etracs2/entity/IndividualPage.style")
public class IndividualPage extends javax.swing.JPanel {
    
    /** Creates new form AccountPage */
    public IndividualPage() {
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
        jPanel5 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xTextField3 = new com.rameses.rcp.control.XTextField();
        xTextField4 = new com.rameses.rcp.control.XTextField();
        xTextField5 = new com.rameses.rcp.control.XTextField();
        xTextField8 = new com.rameses.rcp.control.XTextField();
        xSeparator1 = new com.rameses.rcp.control.XSeparator();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xTextField6 = new com.rameses.rcp.control.XTextField();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xComboBox3 = new com.rameses.rcp.control.XComboBox();
        xSeparator2 = new com.rameses.rcp.control.XSeparator();
        xTextField7 = new com.rameses.rcp.control.XTextField();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xComboBox4 = new com.rameses.rcp.control.XComboBox();
        xTextField9 = new com.rameses.rcp.control.XTextField();
        xTextField10 = new com.rameses.rcp.control.XTextField();
        xTextField11 = new com.rameses.rcp.control.XTextField();
        xTextField12 = new com.rameses.rcp.control.XTextField();

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
        jPanel5.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Personal Information");
        formPanel1.setBorder(xTitledBorder2);
        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel1.setForeground(new java.awt.Color(204, 0, 0));
        xLabel1.setCaption("Account No.");
        xLabel1.setCaptionWidth(90);
        xLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        xLabel1.setName("entity.entityno");
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel1);

        xTextField1.setCaption("Last Name");
        xTextField1.setCaptionWidth(90);
        xTextField1.setIndex(-10);
        xTextField1.setName("entity.info.lastname");
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField1.setRequired(true);
        formPanel1.add(xTextField1);

        xTextField2.setCaption("First Name");
        xTextField2.setCaptionWidth(90);
        xTextField2.setName("entity.info.firstname");
        xTextField2.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField2.setRequired(true);
        formPanel1.add(xTextField2);

        xTextField3.setCaption("Middle Name");
        xTextField3.setCaptionWidth(90);
        xTextField3.setName("entity.info.middlename");
        xTextField3.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xTextField3);

        xTextField4.setCaption("Address");
        xTextField4.setCaptionWidth(90);
        xTextField4.setName("entity.entityaddress");
        xTextField4.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField4.setRequired(true);
        formPanel1.add(xTextField4);

        xTextField5.setCaption("Mailing Address");
        xTextField5.setCaptionWidth(90);
        xTextField5.setName("entity.info.mailingaddress");
        xTextField5.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xTextField5);

        xTextField8.setCaption("Contact No.");
        xTextField8.setCaptionWidth(90);
        xTextField8.setName("entity.info.contactno");
        xTextField8.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xTextField8);

        xSeparator1.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel1.add(xSeparator1);

        xDateField1.setCaption("Birth Date");
        xDateField1.setCaptionWidth(90);
        xDateField1.setName("entity.info.birthdate");
        xDateField1.setPreferredSize(new java.awt.Dimension(120, 19));
        formPanel1.add(xDateField1);

        xTextField6.setCaption("Place of Birth");
        xTextField6.setCaptionWidth(90);
        xTextField6.setName("entity.info.birthplace");
        xTextField6.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xTextField6);

        xComboBox1.setCaption("Citizenship");
        xComboBox1.setCaptionWidth(90);
        xComboBox1.setItems("citizenshipList");
        xComboBox1.setName("entity.info.citizenship");
        xComboBox1.setPreferredSize(new java.awt.Dimension(0, 22));
        formPanel1.add(xComboBox1);

        xComboBox2.setCaption("Gender");
        xComboBox2.setCaptionWidth(90);
        xComboBox2.setItems("genderList");
        xComboBox2.setName("entity.info.gender");
        xComboBox2.setPreferredSize(new java.awt.Dimension(0, 22));
        formPanel1.add(xComboBox2);

        xComboBox3.setCaption("Civil Status");
        xComboBox3.setCaptionWidth(90);
        xComboBox3.setItems("civilStatusList");
        xComboBox3.setName("entity.info.civilstatus");
        xComboBox3.setPreferredSize(new java.awt.Dimension(0, 22));
        formPanel1.add(xComboBox3);

        xSeparator2.setPreferredSize(new java.awt.Dimension(0, 20));
        formPanel1.add(xSeparator2);

        xTextField7.setCaption("Remarks");
        xTextField7.setCaptionWidth(90);
        xTextField7.setName("entity.info.remarks");
        xTextField7.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xTextField7);

        jPanel5.add(formPanel1);
        formPanel1.setBounds(4, 8, 332, 360);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setTitle("Other Information");
        formPanel2.setBorder(xTitledBorder3);
        xComboBox4.setCaption("Profession");
        xComboBox4.setCaptionWidth(70);
        xComboBox4.setItems("professionList");
        xComboBox4.setName("entity.info.profession");
        xComboBox4.setPreferredSize(new java.awt.Dimension(0, 22));
        formPanel2.add(xComboBox4);

        xTextField9.setCaption("TIN");
        xTextField9.setCaptionWidth(70);
        xTextField9.setName("entity.info.tin");
        xTextField9.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xTextField9);

        xTextField10.setCaption("SSS");
        xTextField10.setCaptionWidth(70);
        xTextField10.setName("entity.info.sss");
        xTextField10.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xTextField10);

        xTextField11.setCaption("Height");
        xTextField11.setCaptionWidth(70);
        xTextField11.setName("entity.info.height");
        xTextField11.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xTextField11);

        xTextField12.setCaption("Weight");
        xTextField12.setCaptionWidth(70);
        xTextField12.setName("entity.info.weight");
        xTextField12.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xTextField12);

        jPanel5.add(formPanel2);
        formPanel2.setBounds(340, 8, 266, 360);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 639, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 408, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XComboBox xComboBox3;
    private com.rameses.rcp.control.XComboBox xComboBox4;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XSeparator xSeparator1;
    private com.rameses.rcp.control.XSeparator xSeparator2;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField10;
    private com.rameses.rcp.control.XTextField xTextField11;
    private com.rameses.rcp.control.XTextField xTextField12;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    private com.rameses.rcp.control.XTextField xTextField4;
    private com.rameses.rcp.control.XTextField xTextField5;
    private com.rameses.rcp.control.XTextField xTextField6;
    private com.rameses.rcp.control.XTextField xTextField7;
    private com.rameses.rcp.control.XTextField xTextField8;
    private com.rameses.rcp.control.XTextField xTextField9;
    // End of variables declaration//GEN-END:variables
    
}
