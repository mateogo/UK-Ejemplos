package kennedy.ar.ui.ejemplos;

import javax.swing.*;
import java.awt.event.*;

public class ExitableJFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//public static final int EXIT_ON_CLOSE = -1;
	private int returnCode = 0;

	public ExitableJFrame() {
		init();
	}

	public ExitableJFrame(String title) {
		super(title);
		init();
	}

	private void init() {
		super.frameInit();
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void setReturnCode(int newValue) {
		returnCode = newValue;
	}

	protected void processWindowEvent(WindowEvent e) {
		super.processWindowEvent(e);
		int defaultCloseOperation = getDefaultCloseOperation();
		if ((e.getID() == WindowEvent.WINDOW_CLOSING)
				&& (defaultCloseOperation == EXIT_ON_CLOSE)) {
			System.exit(returnCode);
		}
	}

	protected String paramString() {
		String returnValue = "";
		int defaultCloseOperation = getDefaultCloseOperation();
		if (defaultCloseOperation == EXIT_ON_CLOSE) {
			returnValue = ",EXIT_ON_CLOSE";
		}
		return super.paramString() + returnValue;
	}
}