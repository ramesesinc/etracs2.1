/*
 * LandRPUPage.java
 *
 * Created on June 25, 2011, 1:45 PM
 */

package etracs2.rpt.faas.rpu.planttree;

import com.rameses.rcp.ui.annotations.StyleSheet;

@StyleSheet("etracs2.rpt.faas.rpu.planttree.PlantTreeRPUPage.style")
public class PlantTreeRPUPage extends javax.swing.JPanel {
    
    /** Creates new form LandRPUPage */
    public PlantTreeRPUPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel3 = new javax.swing.JPanel();
        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        formPanel9 = new com.rameses.rcp.util.FormPanel();
        xCheckBox1 = new com.rameses.rcp.control.XCheckBox();
        xComboBox5 = new com.rameses.rcp.control.XComboBox();
        formPanel3 = new com.rameses.rcp.util.FormPanel();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();
        xNumberField2 = new com.rameses.rcp.control.XNumberField();
        xNumberField3 = new com.rameses.rcp.control.XNumberField();
        jPanel2 = new javax.swing.JPanel();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        formPanel14 = new com.rameses.rcp.util.FormPanel();
        xNumberField23 = new com.rameses.rcp.control.XNumberField();
        xNumberField25 = new com.rameses.rcp.control.XNumberField();
        xLabel6 = new com.rameses.rcp.control.XLabel();
        xComboBox6 = new com.rameses.rcp.control.XComboBox();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        xActionBar1.setName("formActions");
        xActionBar1.setPadding(new java.awt.Insets(3, 0, 3, 0));
        xActionBar1.setUseToolBar(false);
        jPanel3.add(xActionBar1, java.awt.BorderLayout.EAST);

        add(jPanel3, java.awt.BorderLayout.SOUTH);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("General Information");
        formPanel1.setBorder(xTitledBorder1);
        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel1.setCaption("Revision Year");
        xLabel1.setName("rpu.ry");
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel1);

        xLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel2.setCaption("PIN");
        xLabel2.setName("rpu.fullpin");
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel2);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Taxability");
        formPanel9.setBorder(xTitledBorder2);
        xCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xCheckBox1.setText("Taxable? ");
        xCheckBox1.setCaption("Taxability");
        xCheckBox1.setCaptionWidth(90);
        xCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        xCheckBox1.setName("rpu.taxable");
        xCheckBox1.setRequestFocus(false);
        formPanel9.add(xCheckBox1);

        xComboBox5.setCaption("Exempt Reason");
        xComboBox5.setCaptionWidth(90);
        xComboBox5.setDepends(new String[] {"rpu.taxable"});
        xComboBox5.setExpression("#{exemptcode}");
        xComboBox5.setItems("exemptions");
        xComboBox5.setName("exemption");
        xComboBox5.setPreferredSize(new java.awt.Dimension(0, 22));
        formPanel9.add(xComboBox5);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(formPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(formPanel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 228, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, formPanel9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setTitle("Assessment Summary");
        formPanel3.setBorder(xTitledBorder3);
        formPanel3.setCaptionBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        formPanel3.setCellpadding(new java.awt.Insets(0, 0, 0, 20));
        formPanel3.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        xNumberField1.setEditable(false);
        xNumberField1.setCaption("Base Market Value");
        xNumberField1.setCaptionWidth(110);
        xNumberField1.setCellPadding(new java.awt.Insets(0, 0, 0, 20));
        xNumberField1.setFont(new java.awt.Font("Arial", 1, 12));
        xNumberField1.setName("rpu.totalbmv");
        xNumberField1.setPreferredSize(new java.awt.Dimension(130, 19));
        formPanel3.add(xNumberField1);

        xNumberField2.setEditable(false);
        xNumberField2.setCaption("Market Value");
        xNumberField2.setCellPadding(new java.awt.Insets(0, 0, 0, 20));
        xNumberField2.setFont(new java.awt.Font("Arial", 1, 12));
        xNumberField2.setName("rpu.totalmv");
        xNumberField2.setPreferredSize(new java.awt.Dimension(130, 19));
        formPanel3.add(xNumberField2);

        xNumberField3.setEditable(false);
        xNumberField3.setCaption("Assessed Value");
        xNumberField3.setCaptionWidth(100);
        xNumberField3.setCellPadding(new java.awt.Insets(0, 0, 0, 20));
        xNumberField3.setFont(new java.awt.Font("Arial", 1, 12));
        xNumberField3.setName("rpu.totalav");
        xNumberField3.setPreferredSize(new java.awt.Dimension(120, 19));
        formPanel3.add(xNumberField3);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder4 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder4.setTitle("Tree Detail");
        jPanel2.setBorder(xTitledBorder4);
        xDataTable1.setDynamic(true);
        xDataTable1.setHandler("planttreeListHandler");
        xDataTable1.setImmediate(true);
        xDataTable1.setName("selectedPlantTree");
        xDataTable1.setShowRowHeader(true);

        jLabel2.setText("Classification * :");

        formPanel14.setCaptionWidth(50);
        formPanel14.setPadding(new java.awt.Insets(0, 0, 0, 0));
        xNumberField23.setEditable(false);
        xNumberField23.setCaption("Total Bearing");
        xNumberField23.setCaptionWidth(135);
        xNumberField23.setFieldType(int.class);
        xNumberField23.setFont(new java.awt.Font("Arial", 1, 11));
        xNumberField23.setName("rpu.info.totalbearing");
        xNumberField23.setPattern("#,##0");
        xNumberField23.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel14.add(xNumberField23);

        xNumberField25.setEditable(false);
        xNumberField25.setCaption("Total Non Bearing");
        xNumberField25.setCaptionWidth(135);
        xNumberField25.setFieldType(int.class);
        xNumberField25.setFont(new java.awt.Font("Arial", 1, 11));
        xNumberField25.setName("rpu.info.totalnonbearing");
        xNumberField25.setPattern("#,##0");
        xNumberField25.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel14.add(xNumberField25);

        org.jdesktop.layout.GroupLayout jPanel13Layout = new org.jdesktop.layout.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(630, Short.MAX_VALUE)
                .add(formPanel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 256, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel13Layout.createSequentialGroup()
                .add(formPanel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        xLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        xLabel6.setForeground(new java.awt.Color(153, 0, 0));
        xLabel6.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel6.setName("errorMsg");

        xComboBox6.setCaption("Classification");
        xComboBox6.setExpression(" #{classcode}");
        xComboBox6.setIndex(-100);
        xComboBox6.setItems("classifications");
        xComboBox6.setName("classification");
        xComboBox6.setRequired(true);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(xDataTable1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(xLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(xComboBox6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(xComboBox6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(14, 14, 14)
                .add(xDataTable1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(formPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(formPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        add(jPanel4, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel14;
    private com.rameses.rcp.util.FormPanel formPanel3;
    private com.rameses.rcp.util.FormPanel formPanel9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XCheckBox xCheckBox1;
    private com.rameses.rcp.control.XComboBox xComboBox5;
    private com.rameses.rcp.control.XComboBox xComboBox6;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel6;
    private com.rameses.rcp.control.XNumberField xNumberField1;
    private com.rameses.rcp.control.XNumberField xNumberField2;
    private com.rameses.rcp.control.XNumberField xNumberField23;
    private com.rameses.rcp.control.XNumberField xNumberField25;
    private com.rameses.rcp.control.XNumberField xNumberField3;
    // End of variables declaration//GEN-END:variables
    
}
