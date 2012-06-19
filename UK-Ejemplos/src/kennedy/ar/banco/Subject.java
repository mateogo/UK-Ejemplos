package kennedy.ar.banco;


public interface Subject {
	
	public void suscribeObserver(Observer unObservador);
	
	public void unSuscribeObserver(Observer unObservador);
	
	public void notifyEvent();

}
