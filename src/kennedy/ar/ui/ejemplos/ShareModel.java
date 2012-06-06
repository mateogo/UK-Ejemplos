package kennedy.ar.ui.ejemplos;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import org.apache.log4j.Logger;

public class ShareModel {
	final static Logger appLogger = Logger.getLogger("kennedy.ar.ui");

	public ShareModel(){
		  appLogger.warn("shared model instanciado");
	}

  public static void main (String args[]) {
    JFrame f = new ExitableJFrame("Sharing Sample");
    Container content = f.getContentPane();
    JTextArea textarea1 = new JTextArea();
    Document document = textarea1.getDocument();
    JTextArea textarea2 = new JTextArea(document);
    JTextArea textarea3 = new JTextArea(document);
    content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
    content.add(new JScrollPane(textarea1));
    content.add(new JScrollPane(textarea2));
    content.add(new JScrollPane(textarea3));
    f.setSize (300, 400);
    f.setVisible (true);
  }
  public void printInfo(){
	appLogger.info("Printing information....");  
  }
}