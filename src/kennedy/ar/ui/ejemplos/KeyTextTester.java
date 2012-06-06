/*
 * KeyTextTester.java
 *
 * Created on 9 de abril de 2001, 11:10
 */

package kennedy.ar.ui.ejemplos;
//import java.awt.*;
import java.awt.event.*;
//import javax.swing.event.*;
//import java.util.EventListener;

/**
 *
 * @author  mateo
 * @version 
 */
public class KeyTextTester extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/** Creates new form KeyTextTester */
    public KeyTextTester() {
        initComponents ();
        initMyComponent();
        pack ();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the FormEditor.
     */
    private void initComponents () {//GEN-BEGIN:initComponents
        jTextField1 = new javax.swing.JTextField ();
        addWindowListener (new java.awt.event.WindowAdapter () {
            public void windowClosing (java.awt.event.WindowEvent evt) {
                exitForm (evt);
            }
        }
        );

        jTextField1.setText ("jTextField1");


        getContentPane ().add (jTextField1, java.awt.BorderLayout.SOUTH);

    }//GEN-END:initComponents

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit (0);
    }//GEN-LAST:event_exitForm

    /**
    * @param args the command line arguments
    */
    public static void main (String args[]) {
        new KeyTextTester ().setVisible (true);
    }

    private void initMyComponent () {
        KeyTextComponent keyTextComponent = new KeyTextComponent();
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed (ActionEvent evt) {
                System.out.println("iuju");
                String keyText = evt.getActionCommand();
                jTextField1.setText(keyText);
            }
        };
        keyTextComponent.addActionListener(actionListener);
        getContentPane ().add (keyTextComponent, java.awt.BorderLayout.CENTER);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}