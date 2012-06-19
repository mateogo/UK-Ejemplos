package kennedy.ar.ui.texteditor;

/**
 * @author mateo
 * 
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates. To enable and disable the creation of type
 * comments go to Window>Preferences>Java>Code Generation.
 */
public interface EventDispatcher {

	/**
	 * Method addObserver.
	 * 
	 * @param textPrinter
	 */
	public boolean addObserver(EventObserver eventObserver);

}