import java.util.List;

import org.apache.log4j.Logger;


public class Compania {
	private CompaniaObservable companiaObservable;
	private static Logger logger = Logger.getLogger(Compania.class);
	
	public Compania(List<? extends Linea> lineas) {
		this.companiaObservable = new CompaniaObservable(lineas);
	}

	public void realizarOperacion(TipoOperacion tipoOperacion, double porcentaje){
		this.companiaObservable.setTipoOperacion(tipoOperacion);
		this.companiaObservable.setPorcentaje(porcentaje);
		logger.info("Compania realiza operacion :"+tipoOperacion+" por: "+porcentaje);
		this.companiaObservable.setChanged();
		logger.info("Se notifica a las líneas para que cambien su saldo.\n");
		this.companiaObservable.notifyObservers();
	}
	
}
