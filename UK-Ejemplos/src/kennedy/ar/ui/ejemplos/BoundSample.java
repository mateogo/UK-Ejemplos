/*
 * BoundSample.java
 *
 * Created on 9 de abril de 2001, 9:53
 */

package kennedy.ar.ui.ejemplos;
import java.awt.*;
//import java.beans.*;

/**
 *
 * @author  mateo
 * @version 
 */
public class BoundSample extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Creates new form BoundSample */
    public BoundSample() {
        initComponents ();
        pack ();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the FormEditor.
     */
    private void initComponents () {//GEN-BEGIN:initComponents
        jButton1 = new javax.swing.JButton ();
        jButton2 = new javax.swing.JButton ();
        addWindowListener (new java.awt.event.WindowAdapter () {
            public void windowClosing (java.awt.event.WindowEvent evt) {
                exitForm (evt);
            }
        }
        );

        jButton1.setText ("Boton-1");
        jButton1.addActionListener (new java.awt.event.ActionListener () {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed (evt);
            }
        }
        );
        jButton1.addPropertyChangeListener (new java.beans.PropertyChangeListener () {
            public void propertyChange (java.beans.PropertyChangeEvent evt) {
                jButton1PropertyChange (evt);
            }
        }
        );


        getContentPane ().add (jButton1, java.awt.BorderLayout.NORTH);

        jButton2.setText ("Boton-2");
        jButton2.addActionListener (new java.awt.event.ActionListener () {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed (evt);
            }
        }
        );


        getContentPane ().add (jButton2, java.awt.BorderLayout.SOUTH);

    }//GEN-END:initComponents

  private void jButton2ActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// Add your handling code here:
  }//GEN-LAST:event_jButton2ActionPerformed

  private void jButton1ActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// Add your handling code here:
    javax.swing.JButton jButton = (javax.swing.JButton)evt.getSource();
    int red=    (int) (Math.random()*255);
    int green = (int) (Math.random()*255);
    int blue=   (int) (Math.random()*255);
    jButton.setBackground(new Color(red, green, blue));
    
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton1PropertyChange (java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButton1PropertyChange
// Add your handling code here:
    String property = evt.getPropertyName();
    //if("background".equals(property)){
    if(property.equals("background")){
        jButton2.setBackground((Color)evt.getNewValue());
    }
  }//GEN-LAST:event_jButton1PropertyChange

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit (0);
    }//GEN-LAST:event_exitForm

    /**
    * @param args the command line arguments
    */
    public static void main (String args[]) {
        new BoundSample ().setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables

}