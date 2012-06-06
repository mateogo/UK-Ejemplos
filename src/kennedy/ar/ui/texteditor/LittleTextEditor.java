/*
 * Patrones.java
 *
 * Created on June 13, 2003, 2:12 PM
 */

package kennedy.ar.ui.texteditor;

/**
 * 
 * @author pablo
 */
public class LittleTextEditor extends javax.swing.JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public static void main(String args[]) {
		new LittleTextEditor().setVisible(true);
	}

	private javax.swing.JButton jButtonAccept;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenu jMenuFile;
	
	private javax.swing.JMenuItem jMenuItemNew;
	private javax.swing.JPanel jPanelButtons;
	private javax.swing.JPanel jPanelContainer;
	private javax.swing.JPanel jPanelTextArea;
	private javax.swing.JScrollPane jScrollPane;
	private javax.swing.JTextArea jTextArea;
	private AcceptButton myButton;

	
	
	public LittleTextEditor() {
		initComponents();
	}

	
	private void exitForm(java.awt.event.WindowEvent evt) {
		System.exit(0);
	}

	
	public AcceptButton getMyButton() {
		if (myButton == null)
			myButton = new AcceptButton(this);
		return myButton;
	}

	
	public javax.swing.JTextArea getTextArea() {
		return jTextArea;
	}
	
		
	private void initComponents() {
		jPanelContainer = new javax.swing.JPanel();
		jPanelButtons = new javax.swing.JPanel();
		jButtonAccept = new javax.swing.JButton();
		jPanelTextArea = new javax.swing.JPanel();
		jScrollPane = new javax.swing.JScrollPane();
		jTextArea = new javax.swing.JTextArea();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenuFile = new javax.swing.JMenu();
		jMenuItemNew = new javax.swing.JMenuItem();
		
			
		

		setTitle("Patron Observer");
		setName("PatronObserverFrame");
		
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				exitForm(evt);
			}
		});
		
		
		jPanelContainer.setLayout(new java.awt.BorderLayout());

		jPanelButtons.setLayout(new java.awt.FlowLayout(
				java.awt.FlowLayout.LEFT));

		jButtonAccept.setMnemonic('I');
		jButtonAccept.setText("Imprimir/Grabar");
		jButtonAccept.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAcceptActionPerformed(evt);
			}
		});

		jPanelButtons.add(jButtonAccept);

		jPanelContainer.add(jPanelButtons, java.awt.BorderLayout.EAST);

		jPanelTextArea.setLayout(new javax.swing.BoxLayout(jPanelTextArea,
				javax.swing.BoxLayout.X_AXIS));

		jPanelTextArea.setPreferredSize(new java.awt.Dimension(350, 200));
		jTextArea.setLineWrap(true);
		jTextArea.setWrapStyleWord(true);
		jScrollPane.setViewportView(jTextArea);

		jPanelTextArea.add(jScrollPane);

		jPanelContainer.add(jPanelTextArea, java.awt.BorderLayout.CENTER);

		getContentPane().add(jPanelContainer, java.awt.BorderLayout.CENTER);

		jMenuFile.setMnemonic('A');
		jMenuFile.setText("Archivo");
		jMenuItemNew.setMnemonic('N');
		jMenuItemNew.setText("Nuevo");
		jMenuItemNew.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemNewActionPerformed(evt);
			}
		});

		jMenuFile.add(jMenuItemNew);
		jMenuBar1.add(jMenuFile);
		setJMenuBar(jMenuBar1);

		pack();
	}

	private void jButtonAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcceptActionPerformed
		getMyButton().actionHappened(evt);

	}

	private void jMenuItemNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewActionPerformed
		jTextArea.setText("");
	}

	
	public void setMyButton(AcceptButton myButton) {
		this.myButton = myButton;
	}

	
	
	public void setTextArea(javax.swing.JTextArea jTextArea) {
		this.jTextArea = jTextArea;
	}

}