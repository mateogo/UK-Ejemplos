package kennedy.ar.ui.texteditor;

import java.awt.event.ActionEvent;

/**
 * @author mateo
 * 
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates. To enable and disable the creation of type
 * comments go to Window>Preferences>Java>Code Generation.
 */
public class Grabar implements EventObserver {

	/**
	 * Constructor for Grabar.
	 */
	public Grabar() {
		super();
	}

	/**
	 * Constructor for TextPrinter.
	 */
	public boolean addMeAsObserver(EventDispatcher eventDispacher) {
		boolean ok = eventDispacher.addObserver(this);
		return ok;
	}

	
	public void actionHappened(ActionEvent evt) {
		grabar();
	}

	
	
	private void grabar() {
		// aca viene la parte de grabacion
		System.out.println("A grabar se ha dicho!!!!");
	}

}