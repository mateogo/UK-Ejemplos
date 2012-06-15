import java.util.Observable;
import org.apache.log4j.Logger;

public class LineaClaro extends Linea {
	private static Logger logger = Logger.getLogger(LineaClaro.class);	
		
	public LineaClaro(String nroLinea) {
		super(nroLinea);
		logger.info("Linea Creada: " + this.toString());
	}

	@Override
	public void update(Observable observable, Object compania) {
		logger.info("Nro. Linea: " + this.getNroLinea() + ", Mensaje recibido: " + ((Compania) compania).getMensajeEnviado());
	}

	@Override
	public String toString() {
		return this.getClass().getName();
	}
	
}
