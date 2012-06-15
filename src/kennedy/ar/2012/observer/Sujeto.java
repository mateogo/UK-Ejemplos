import java.util.List;
import java.util.Observable;
import java.util.Observer;
import org.apache.log4j.Logger;

public class Sujeto extends Observable {
	private Aviso aviso;
	private static Logger logger = Logger.getLogger(Sujeto.class);
	
	public Sujeto(List<? extends Observer> observers) {
		this.aviso = new Aviso();
		for(Observer o : observers){
			this.addObserver(o);
		}
	}
		
	public void enviarAviso(TipoAviso tipoAvisoAenviar, Compania compania){
		setChanged();
		this.aviso.setTipoAvisoActual(tipoAvisoAenviar);
		logger.info("Mensaje a Enviar Por el Sujeto: " + this.aviso.getMensajeTipoAvisoActual());
		notifyObservers(compania);
		logger.info("Se Envio el Mensaje a los Observers");
	}
	
	public String getMensajeActual(){
		return this.aviso.getMensajeTipoAvisoActual();
	}
	
}
