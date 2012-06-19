import java.util.List;
import java.util.Observable;

import org.apache.log4j.Logger;


public class CompaniaObservable extends Observable {
	
	private static Logger logger = Logger.getLogger(CompaniaObservable.class);
	private TipoOperacion tipoOperacion;
	private double porcentaje;
	
	public CompaniaObservable(List<? extends Linea> lineas) {
		
		for(Linea l : lineas){
			this.addObserver(l);
			logger.info("Linea: "+l.toString() + " se agrega como observer");
		}
	}

	@Override
	public synchronized void setChanged() {
		logger.info("Observable cambia de estado!");
		super.setChanged();
	}

	public TipoOperacion getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(TipoOperacion tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
					
}
