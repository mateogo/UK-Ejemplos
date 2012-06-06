package kennedy.ar.ui.texteditor;
import java.util.Iterator;


public class AcceptButton implements EventDispatcher {
	
	private java.util.ArrayList<EventObserver> observers;
	
	
	public AcceptButton(LittleTextEditor lte) {
		super();
		lte.setMyButton(this);
	}
	
	
	public void actionHappened(java.awt.event.ActionEvent evt) {
		System.out
				.println("Accept: Se disparo un evento, cheee!!!! enseguida le aviso a todos!!");
		fireEvent(evt);

	}

	
	private void fireEvent(java.awt.event.ActionEvent evt) {
		Iterator<EventObserver> it = getObservers().iterator();
		while (it.hasNext()) {
			EventObserver eo = it.next();
			eo.actionHappened(evt);
		}
	}
	

	public boolean addObserver(EventObserver eventObserver) {
		addObserverToList(eventObserver);
		return true;
	}

	
	
	private void addObserverToList(EventObserver eventObserver) {
		getObservers().add(eventObserver);

	}

	
	public java.util.ArrayList<EventObserver> getObservers() {
		if (observers == null)
			observers = new java.util.ArrayList<EventObserver>();
		return observers;
	}

	
	
	public void setObservers(java.util.ArrayList<EventObserver> observers) {
		this.observers = observers;
	}

}