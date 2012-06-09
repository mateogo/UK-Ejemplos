import java.util.List;
import java.util.Observable;


public class CompaniaObservable extends Observable {
	private TipoOperacion tipoOperacion;
	private double porcentaje;
	
	public CompaniaObservable(List<? extends Linea> lineas) {
		for(Linea l : lineas){
			this.addObserver(l);
		}
	}

	@Override
	public synchronized void setChanged() {
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
