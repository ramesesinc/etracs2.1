/*
 * IntegerValuePage.java
 *
 * Created on June 20, 2011, 1:47 PM
 */

package rulemgmt.support;

/**
 *
 * @author  jzamora
 */
public class StringValuePage extends javax.swing.JPanel {
    
    /** Creates new form IntegerValuePage */
    public StringValuePage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        xButton1 = new com.rameses.rcp.control.XButton();
        xLabel1 = new com.rameses.rcp.control.XLabel();

        setLayout(new java.awt.BorderLayout());

        xButton1.setText("...");
        xButton1.setMargin(new java.awt.Insets(3, 5, 3, 5));
        xButton1.setName("lookup");
        add(xButton1, java.awt.BorderLayout.EAST);

        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        xLabel1.setName("value");
        add(xLabel1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XLabel xLabel1;
    // End of variables declaration//GEN-END:variables
    
}
