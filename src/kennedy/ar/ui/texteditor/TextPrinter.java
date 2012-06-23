package kennedy.ar.ui.texteditor;

import java.awt.event.ActionEvent;
import java.io.PrintWriter;

/**
 * @author mateo
 * 
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates. To enable and disable the creation of type
 * comments go to Window>Preferences>Java>Code Generation.
 */
public class TextPrinter implements EventObserver {
	
	//private String texto;
	
	private javax.swing.JTextArea jTextArea;
	private PrintWriter out = new PrintWriter(System.out);

	
	
	
	public TextPrinter() {
		super();
	}
	
	
	public TextPrinter(javax.swing.JTextArea jte) {
		this();
		setJTextArea(jte);
	}
	
	
	
	public boolean addMeAsObserver(EventDispatcher eventDispacher) {
		boolean ok = eventDispacher.addObserver(this);
		return ok;
	}

	
	
	
	public void actionHappened(ActionEvent evt) {
		printText();
	}

	
	
	
	private void printText() {
		out.println(getJTextArea().getText());
		out.flush();
	}


	public javax.swing.JTextArea getJTextArea() {
		return jTextArea;
	}

		
	public void setJTextArea(javax.swing.JTextArea jTextArea) {
		this.jTextArea = jTextArea;
	}
	

}