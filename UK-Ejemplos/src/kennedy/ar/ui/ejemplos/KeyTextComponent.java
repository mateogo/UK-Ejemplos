/*
 * KeyTextComponent.java
 *
 * Created on 9 de abril de 2001, 10:37
 */

package kennedy.ar.ui.ejemplos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.EventListener;

/**
 *
 * @author  mateo
 * @version
 */
public class KeyTextComponent extends Canvas {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EventListenerList actionListenerList= new EventListenerList();

    /** Creates new KeyTextComponent */
    public KeyTextComponent() {
        setBackground(Color.cyan);
        KeyListener internalKeyListener = new KeyAdapter(){
            public void keyPressed(KeyEvent keyEvent){
                if (actionListenerList != null){
                    int keyCode = keyEvent.getKeyCode();
                    String keyText  = KeyEvent.getKeyText(keyCode);
                    ActionEvent actionEvent = new ActionEvent(
                    this,
                    ActionEvent.ACTION_PERFORMED,
                    keyText);
                    fireActionPerformed(actionEvent);
                }
            }
        };
        MouseListener internalMouseListener = new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent){
                requestFocus();

                ActionEvent actionEvent = new ActionEvent(
                    this,
                    ActionEvent.ACTION_PERFORMED,
                    "mousedepressed");
                fireActionPerformed(actionEvent);
            }

        };
        addKeyListener(internalKeyListener);
        addMouseListener(internalMouseListener);
    }
    public void addActionListener(ActionListener actionListener){
        System.out.println("agregando listeners");

        actionListenerList.add(ActionListener.class,actionListener);
    }
    public void removeActionListener(ActionListener actionListener){
        actionListenerList.remove(ActionListener.class, actionListener);
    }
    protected void fireActionPerformed(ActionEvent actionEvent){
        EventListener listenerList[]=
        actionListenerList.getListeners(ActionListener.class);
        for (int i=0,n=listenerList.length;i<n;i++){
            System.out.println("fireaction");
            ((ActionListener)listenerList[i]).actionPerformed(actionEvent);
        }
    }
    public boolean isFocusTraversable(){
        return true;
    }
}

