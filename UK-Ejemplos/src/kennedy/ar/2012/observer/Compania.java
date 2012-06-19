import java.util.List;
import java.util.Observer;

public class Compania {
	private Sujeto sujeto;
		
	public Compania(List<? extends Observer> observers) {
		this.sujeto = new Sujeto(observers);
	}

	public void enviarMensaje(TipoAviso tipoAvisoAenviar){
		this.sujeto.enviarAviso(tipoAvisoAenviar, this);
	}
	
	public String getMensajeEnviado(){
		return this.sujeto.getMensajeActual();
	}
	
}
