/*
 * MachInformation.java
 *
 * Created on June 29, 2011, 2:02 PM
 */

package etracs2.rpt.faas.rpu.mach;

import com.rameses.rcp.ui.annotations.StyleSheet;

/**
 *
 * @author  rameses
 */
@StyleSheet("etracs2/rpt/faas/rpu/mach/MachDetailPage.style")
public class MachDetailPage extends javax.swing.JPanel {
    
    /** Creates new form MachInformation */
    public MachDetailPage() {
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
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xLookupField1 = new com.rameses.rcp.control.XLookupField();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        jPanel2 = new javax.swing.JPanel();
        xCheckBox1 = new com.rameses.rcp.control.XCheckBox();
        xCheckBox2 = new com.rameses.rcp.control.XCheckBox();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xNumberField11 = new com.rameses.rcp.control.XNumberField();
        formPanel3 = new com.rameses.rcp.util.FormPanel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xTextField3 = new com.rameses.rcp.control.XTextField();
        xTextField4 = new com.rameses.rcp.control.XTextField();
        xTextField5 = new com.rameses.rcp.control.XTextField();
        xSeparator1 = new com.rameses.rcp.control.XSeparator();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();
        xNumberField2 = new com.rameses.rcp.control.XNumberField();
        xNumberField3 = new com.rameses.rcp.control.XNumberField();
        xNumberField4 = new com.rameses.rcp.control.XNumberField();
        xNumberField5 = new com.rameses.rcp.control.XNumberField();
        xNumberField6 = new com.rameses.rcp.control.XNumberField();
        xCheckBox3 = new com.rameses.rcp.control.XCheckBox();
        formPanel5 = new com.rameses.rcp.util.FormPanel();
        xNumberField7 = new com.rameses.rcp.control.XNumberField();
        xNumberField8 = new com.rameses.rcp.control.XNumberField();
        xNumberField9 = new com.rameses.rcp.control.XNumberField();
        xNumberField10 = new com.rameses.rcp.control.XNumberField();
        xNumberField12 = new com.rameses.rcp.control.XNumberField();
        xNumberField13 = new com.rameses.rcp.control.XNumberField();
        xNumberField14 = new com.rameses.rcp.control.XNumberField();
        xNumberField15 = new com.rameses.rcp.control.XNumberField();
        xNumberField16 = new com.rameses.rcp.control.XNumberField();
        xNumberField17 = new com.rameses.rcp.control.XNumberField();
        xNumberField18 = new com.rameses.rcp.control.XNumberField();
        xNumberField19 = new com.rameses.rcp.control.XNumberField();
        xNumberField21 = new com.rameses.rcp.control.XNumberField();
        jPanel3 = new javax.swing.JPanel();
        xCheckBox4 = new com.rameses.rcp.control.XCheckBox();
        formPanel6 = new com.rameses.rcp.util.FormPanel();
        xNumberField20 = new com.rameses.rcp.control.XNumberField();
        jPanel4 = new javax.swing.JPanel();
        xActionBar1 = new com.rameses.rcp.control.XActionBar();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(596, 500));

        formPanel1.setCaptionWidth(90);
        formPanel1.setPadding(new java.awt.Insets(0, 0, 0, 0));
        xLookupField1.setCaption("Machine Code");
        xLookupField1.setExpression("#{machinecode}");
        xLookupField1.setHandler("lookupMachine");
        xLookupField1.setIndex(-100);
        xLookupField1.setName("machine");
        xLookupField1.setPreferredSize(new java.awt.Dimension(100, 19));
        xLookupField1.setRequired(true);
        formPanel1.add(xLookupField1);

        xLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel2.setCaption("Machine Name");
        xLabel2.setDepends(new String[] {"machine"});
        xLabel2.setName("machdetail.machinename");
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel2);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Machine Information");
        jPanel2.setBorder(xTitledBorder1);
        xCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xCheckBox1.setText("Newly Installed?");
        xCheckBox1.setCheckValue(1);
        xCheckBox1.setIndex(-10);
        xCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        xCheckBox1.setName("newlyinstalled");
        xCheckBox1.setOpaque(false);
        xCheckBox1.setUncheckValue(0);

        xCheckBox2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xCheckBox2.setText("Is Imported?");
        xCheckBox2.setCheckValue(1);
        xCheckBox2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        xCheckBox2.setName("imported");
        xCheckBox2.setOpaque(false);
        xCheckBox2.setUncheckValue(0);

        formPanel2.setCaptionWidth(110);
        xNumberField11.setCaption("Conversion Factor");
        xNumberField11.setDepends(new String[] {"machdetail.imported"});
        xNumberField11.setFieldType(java.math.BigDecimal.class);
        xNumberField11.setName("conversionfactor");
        xNumberField11.setPattern("#,##0.0000");
        xNumberField11.setPreferredSize(new java.awt.Dimension(160, 18));
        formPanel2.add(xNumberField11);

        xTextField1.setCaption("Brand");
        xTextField1.setCaptionWidth(100);
        xTextField1.setName("machdetail.brand");
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel3.add(xTextField1);

        xTextField2.setCaption("Model");
        xTextField2.setCaptionWidth(100);
        xTextField2.setName("machdetail.model");
        xTextField2.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel3.add(xTextField2);

        xTextField3.setCaption("Capacity");
        xTextField3.setCaptionWidth(100);
        xTextField3.setName("machdetail.capacity");
        xTextField3.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel3.add(xTextField3);

        xTextField4.setCaption("Serial No.");
        xTextField4.setCaptionWidth(100);
        xTextField4.setName("machdetail.serialno");
        xTextField4.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel3.add(xTextField4);

        xTextField5.setCaption("Status");
        xTextField5.setCaptionWidth(100);
        xTextField5.setName("machdetail.status");
        xTextField5.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel3.add(xTextField5);

        xSeparator1.setPreferredSize(new java.awt.Dimension(0, 20));
        org.jdesktop.layout.GroupLayout xSeparator1Layout = new org.jdesktop.layout.GroupLayout(xSeparator1);
        xSeparator1.setLayout(xSeparator1Layout);
        xSeparator1Layout.setHorizontalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 256, Short.MAX_VALUE)
        );
        xSeparator1Layout.setVerticalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );
        formPanel3.add(xSeparator1);

        xNumberField1.setCaption("Year Acquired");
        xNumberField1.setCaptionWidth(100);
        xNumberField1.setFieldType(int.class);
        xNumberField1.setName("yearacquired");
        xNumberField1.setPreferredSize(new java.awt.Dimension(0, 18));
        xNumberField1.setRequired(true);
        formPanel3.add(xNumberField1);

        xNumberField2.setCaption("Year Installed");
        xNumberField2.setCaptionWidth(100);
        xNumberField2.setFieldType(int.class);
        xNumberField2.setName("yearinstalled");
        xNumberField2.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel3.add(xNumberField2);

        xNumberField3.setCaption("Operation Year");
        xNumberField3.setCaptionWidth(100);
        xNumberField3.setFieldType(int.class);
        xNumberField3.setName("operationyear");
        xNumberField3.setPreferredSize(new java.awt.Dimension(0, 18));
        xNumberField3.setRequired(true);
        formPanel3.add(xNumberField3);

        xNumberField4.setCaption("Years Used");
        xNumberField4.setCaptionWidth(100);
        xNumberField4.setDepends(new String[] {"yearacquired", "yearinstalled", "operationyear"});
        xNumberField4.setEnabled(false);
        xNumberField4.setFieldType(int.class);
        xNumberField4.setName("machdetail.yearsused");
        xNumberField4.setPreferredSize(new java.awt.Dimension(0, 18));
        xNumberField4.setRequired(true);
        formPanel3.add(xNumberField4);

        xNumberField5.setCaption("Estimated Life");
        xNumberField5.setCaptionWidth(100);
        xNumberField5.setFieldType(int.class);
        xNumberField5.setName("estimatedlife");
        xNumberField5.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel3.add(xNumberField5);

        xNumberField6.setCaption("Remaining Life");
        xNumberField6.setCaptionWidth(100);
        xNumberField6.setDepends(new String[] {"machdetail.estimatedlife", "machdetail.yearsused", "machdetail.operationyear", "machdetail.yearacquired", "machdetail.yearinstalled"});
        xNumberField6.setEnabled(false);
        xNumberField6.setFieldType(int.class);
        xNumberField6.setName("machdetail.remaininglife");
        xNumberField6.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel3.add(xNumberField6);

        xCheckBox3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xCheckBox3.setText("Auto Depreciate?");
        xCheckBox3.setCheckValue(1);
        xCheckBox3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        xCheckBox3.setName("autodepreciate");
        xCheckBox3.setUncheckValue(0);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .add(xCheckBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(65, 65, 65))
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(xCheckBox1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .add(100, 100, 100))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(formPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                        .add(26, 26, 26)
                        .add(formPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(xCheckBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(90, 90, 90)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(xCheckBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xCheckBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(formPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(formPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 250, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xCheckBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Cost Related Information");
        formPanel5.setBorder(xTitledBorder2);
        formPanel5.setCaptionWidth(100);
        xNumberField7.setCaption("Original Cost");
        xNumberField7.setCaptionWidth(110);
        xNumberField7.setFieldType(java.math.BigDecimal.class);
        xNumberField7.setName("originalcost");
        xNumberField7.setPattern("#,##0.00");
        xNumberField7.setPreferredSize(new java.awt.Dimension(0, 18));
        xNumberField7.setRequired(true);
        formPanel5.add(xNumberField7);

        xNumberField8.setCaption("Freight Cost");
        xNumberField8.setCaptionWidth(110);
        xNumberField8.setDepends(new String[] {"newlyinstalled"});
        xNumberField8.setEnabled(false);
        xNumberField8.setFieldType(java.math.BigDecimal.class);
        xNumberField8.setName("freightcost");
        xNumberField8.setPattern("#,##0.00");
        xNumberField8.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel5.add(xNumberField8);

        xNumberField9.setCaption("Installation Cost");
        xNumberField9.setCaptionWidth(110);
        xNumberField9.setDepends(new String[] {"newlyinstalled"});
        xNumberField9.setEnabled(false);
        xNumberField9.setFieldType(java.math.BigDecimal.class);
        xNumberField9.setName("installationcost");
        xNumberField9.setPattern("#,##0.00");
        xNumberField9.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel5.add(xNumberField9);

        xNumberField10.setCaption("Insurance Cost");
        xNumberField10.setCaptionWidth(110);
        xNumberField10.setDepends(new String[] {"newlyinstalled"});
        xNumberField10.setEnabled(false);
        xNumberField10.setFieldType(java.math.BigDecimal.class);
        xNumberField10.setName("insurancecost");
        xNumberField10.setPattern("#,##0.00");
        xNumberField10.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel5.add(xNumberField10);

        xNumberField12.setCaption("Brokerage Cost");
        xNumberField12.setCaptionWidth(110);
        xNumberField12.setDepends(new String[] {"newlyinstalled"});
        xNumberField12.setEnabled(false);
        xNumberField12.setFieldType(java.math.BigDecimal.class);
        xNumberField12.setName("brokeragecost");
        xNumberField12.setPattern("#,##0.00");
        xNumberField12.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel5.add(xNumberField12);

        xNumberField13.setCaption("Arrastre/Handling");
        xNumberField13.setCaptionWidth(110);
        xNumberField13.setDepends(new String[] {"newlyinstalled"});
        xNumberField13.setEnabled(false);
        xNumberField13.setFieldType(java.math.BigDecimal.class);
        xNumberField13.setName("arrastrecost");
        xNumberField13.setPattern("#,##0.00");
        xNumberField13.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel5.add(xNumberField13);

        xNumberField14.setCaption("Other Cost");
        xNumberField14.setCaptionWidth(110);
        xNumberField14.setDepends(new String[] {"newlyinstalled"});
        xNumberField14.setEnabled(false);
        xNumberField14.setFieldType(java.math.BigDecimal.class);
        xNumberField14.setName("othercost");
        xNumberField14.setPattern("#,##0.00");
        xNumberField14.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel5.add(xNumberField14);

        xNumberField15.setCaption("FERAC");
        xNumberField15.setCaptionWidth(110);
        xNumberField15.setDepends(new String[] {"machdetail.newlyinstalled", "machdetail.imported"});
        xNumberField15.setEnabled(false);
        xNumberField15.setFieldType(java.math.BigDecimal.class);
        xNumberField15.setName("machdetail.ferac");
        xNumberField15.setPattern("#,##0.00");
        xNumberField15.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel5.add(xNumberField15);

        xNumberField16.setCaption("Current Forex");
        xNumberField16.setCaptionWidth(110);
        xNumberField16.setDepends(new String[] {"machdetail.newlyinstalled", "machdetail.imported"});
        xNumberField16.setEnabled(false);
        xNumberField16.setFieldType(java.math.BigDecimal.class);
        xNumberField16.setName("machdetail.forex");
        xNumberField16.setPattern("#,##0.00");
        xNumberField16.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel5.add(xNumberField16);

        xNumberField17.setCaption("Acquisition Cost");
        xNumberField17.setCaptionWidth(110);
        xNumberField17.setDepends(new String[] {"machdetail.newlyinstalled", "machdetail.imported"});
        xNumberField17.setEnabled(false);
        xNumberField17.setFieldType(java.math.BigDecimal.class);
        xNumberField17.setName("machdetail.acquisitioncost");
        xNumberField17.setPattern("#,##0.00");
        xNumberField17.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel5.add(xNumberField17);

        xNumberField18.setCaption("Replacement Cost");
        xNumberField18.setCaptionWidth(110);
        xNumberField18.setDepends(new String[] {"machdetail.newlyinstalled", "machdetail.imported"});
        xNumberField18.setEnabled(false);
        xNumberField18.setFieldType(java.math.BigDecimal.class);
        xNumberField18.setName("machdetail.replacementcost");
        xNumberField18.setPattern("#,##0.00");
        xNumberField18.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel5.add(xNumberField18);

        xNumberField19.setCaption("Depreciation ( % )");
        xNumberField19.setCaptionWidth(110);
        xNumberField19.setDepends(new String[] {"machdetail.autodepreciate", "autodepreciate"});
        xNumberField19.setEnabled(false);
        xNumberField19.setFieldType(java.math.BigDecimal.class);
        xNumberField19.setName("depreciation");
        xNumberField19.setPattern("#,##0.00");
        xNumberField19.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel5.add(xNumberField19);

        xNumberField21.setCaption("Depreciation Value");
        xNumberField21.setCaptionWidth(110);
        xNumberField21.setDepends(new String[] {"machdetail.newlyinstalled", "machdetail.imported"});
        xNumberField21.setEnabled(false);
        xNumberField21.setFieldType(java.math.BigDecimal.class);
        xNumberField21.setName("machdetail.depreciationvalue");
        xNumberField21.setPattern("#,##0.00");
        xNumberField21.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel5.add(xNumberField21);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setTitle("Sworn Statement");
        jPanel3.setBorder(xTitledBorder3);
        xCheckBox4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xCheckBox4.setText("Use Sworn Amount?");
        xCheckBox4.setCheckValue(1);
        xCheckBox4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        xCheckBox4.setName("machdetail.useswornamount");
        xCheckBox4.setUncheckValue(0);

        formPanel6.setCaptionWidth(95);
        xNumberField20.setCaption("Sworn Amount");
        xNumberField20.setDepends(new String[] {"machdetail.useswornamount"});
        xNumberField20.setFieldType(java.math.BigDecimal.class);
        xNumberField20.setName("machdetail.swornamount");
        xNumberField20.setPattern("#,##0.00");
        xNumberField20.setPreferredSize(new java.awt.Dimension(0, 18));
        formPanel6.add(xNumberField20);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(xCheckBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
            .add(formPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(xCheckBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(formPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(formPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, formPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(formPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 302, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        xActionBar1.setName("formActions");
        xActionBar1.setPadding(new java.awt.Insets(3, 0, 3, 0));
        xActionBar1.setUseToolBar(false);
        jPanel4.add(xActionBar1, java.awt.BorderLayout.EAST);

        add(jPanel4, java.awt.BorderLayout.SOUTH);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private com.rameses.rcp.util.FormPanel formPanel3;
    private com.rameses.rcp.util.FormPanel formPanel5;
    private com.rameses.rcp.util.FormPanel formPanel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XCheckBox xCheckBox1;
    private com.rameses.rcp.control.XCheckBox xCheckBox2;
    private com.rameses.rcp.control.XCheckBox xCheckBox3;
    private com.rameses.rcp.control.XCheckBox xCheckBox4;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLookupField xLookupField1;
    private com.rameses.rcp.control.XNumberField xNumberField1;
    private com.rameses.rcp.control.XNumberField xNumberField10;
    private com.rameses.rcp.control.XNumberField xNumberField11;
    private com.rameses.rcp.control.XNumberField xNumberField12;
    private com.rameses.rcp.control.XNumberField xNumberField13;
    private com.rameses.rcp.control.XNumberField xNumberField14;
    private com.rameses.rcp.control.XNumberField xNumberField15;
    private com.rameses.rcp.control.XNumberField xNumberField16;
    private com.rameses.rcp.control.XNumberField xNumberField17;
    private com.rameses.rcp.control.XNumberField xNumberField18;
    private com.rameses.rcp.control.XNumberField xNumberField19;
    private com.rameses.rcp.control.XNumberField xNumberField2;
    private com.rameses.rcp.control.XNumberField xNumberField20;
    private com.rameses.rcp.control.XNumberField xNumberField21;
    private com.rameses.rcp.control.XNumberField xNumberField3;
    private com.rameses.rcp.control.XNumberField xNumberField4;
    private com.rameses.rcp.control.XNumberField xNumberField5;
    private com.rameses.rcp.control.XNumberField xNumberField6;
    private com.rameses.rcp.control.XNumberField xNumberField7;
    private com.rameses.rcp.control.XNumberField xNumberField8;
    private com.rameses.rcp.control.XNumberField xNumberField9;
    private com.rameses.rcp.control.XSeparator xSeparator1;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    private com.rameses.rcp.control.XTextField xTextField4;
    private com.rameses.rcp.control.XTextField xTextField5;
    // End of variables declaration//GEN-END:variables
    
}
