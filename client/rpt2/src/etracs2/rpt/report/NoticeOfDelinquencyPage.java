/*
 * NoticeOfDelinquencyPage.java
 *
 * Created on July 11, 2012, 5:38 PM
 */

package etracs2.rpt.report;

/**
 *
 * @author  PRMF
 */
public class NoticeOfDelinquencyPage extends javax.swing.JPanel {
    
    /** Creates new form NoticeOfDelinquencyPage */
    public NoticeOfDelinquencyPage() {
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
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xLabel7 = new com.rameses.rcp.control.XLabel();
        xLabel8 = new com.rameses.rcp.control.XLabel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        xLabel5 = new com.rameses.rcp.control.XLabel();
        xLabel6 = new com.rameses.rcp.control.XLabel();
        xSeparator1 = new com.rameses.rcp.control.XSeparator();
        xLabel12 = new com.rameses.rcp.control.XLabel();
        xLabel13 = new com.rameses.rcp.control.XLabel();
        xLabel14 = new com.rameses.rcp.control.XLabel();
        xLabel10 = new com.rameses.rcp.control.XLabel();
        xLabel11 = new com.rameses.rcp.control.XLabel();

        xActionBar1.setBorder(new com.rameses.rcp.control.border.XUnderlineBorder());
        xActionBar1.setName("formActions");

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Notice of Delinquency Information");
        formPanel1.setBorder(xTitledBorder1);
        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel1.setCaption("Taxpayer");
        xLabel1.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel1.setName("notice.taxpayername");
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel1);

        xLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel2.setCaption("Address");
        xLabel2.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel2.setName("notice.taxpayeraddress");
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel2);

        xLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel7.setCaption("Administrator");
        xLabel7.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel7.setName("notice.administratorname");
        xLabel7.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel7);

        xLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel8.setCaption("Address");
        xLabel8.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel8.setName("notice.administratoraddress");
        xLabel8.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel8);

        xLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel3.setCaption("TD No.");
        xLabel3.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel3.setName("notice.tdno");
        xLabel3.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel3);

        xLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel4.setCaption("Barangay");
        xLabel4.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel4.setName("notice.barangay");
        xLabel4.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel4);

        xLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel5.setCaption("Kind ");
        xLabel5.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel5.setName("notice.rputype");
        xLabel5.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel5);

        xLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel6.setCaption("Classification");
        xLabel6.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel6.setName("notice.classcode");
        xLabel6.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel6);

        xSeparator1.setPreferredSize(new java.awt.Dimension(0, 20));
        org.jdesktop.layout.GroupLayout xSeparator1Layout = new org.jdesktop.layout.GroupLayout(xSeparator1);
        xSeparator1.setLayout(xSeparator1Layout);
        xSeparator1Layout.setHorizontalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 436, Short.MAX_VALUE)
        );
        xSeparator1Layout.setVerticalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );
        formPanel1.add(xSeparator1);

        xLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel12.setCaption("Delinquent Tax");
        xLabel12.setCaptionWidth(100);
        xLabel12.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel12.setName("delinquentamount");
        xLabel12.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel12);

        xLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel13.setCaption("Current Tax");
        xLabel13.setCaptionWidth(100);
        xLabel13.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel13.setName("currentamount");
        xLabel13.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel13);

        xLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel14.setCaption("Delinquent Total");
        xLabel14.setCaptionWidth(100);
        xLabel14.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel14.setName("total");
        xLabel14.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel14);

        xLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel10.setCaption("From ");
        xLabel10.setCaptionWidth(100);
        xLabel10.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel10.setName("notice.delinquentyrqtr");
        xLabel10.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel10);

        xLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel11.setCaption("To");
        xLabel11.setCaptionWidth(100);
        xLabel11.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel11.setName("notice.currentyear");
        xLabel11.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel11);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(xActionBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 450, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(xActionBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 353, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel10;
    private com.rameses.rcp.control.XLabel xLabel11;
    private com.rameses.rcp.control.XLabel xLabel12;
    private com.rameses.rcp.control.XLabel xLabel13;
    private com.rameses.rcp.control.XLabel xLabel14;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XLabel xLabel5;
    private com.rameses.rcp.control.XLabel xLabel6;
    private com.rameses.rcp.control.XLabel xLabel7;
    private com.rameses.rcp.control.XLabel xLabel8;
    private com.rameses.rcp.control.XSeparator xSeparator1;
    // End of variables declaration//GEN-END:variables
    
}
