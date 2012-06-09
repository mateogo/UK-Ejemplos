import java.util.List;


public class Compania {
	private CompaniaObservable companiaObservable;
	
	public Compania(List<? extends Linea> lineas) {
		this.companiaObservable = new CompaniaObservable(lineas);
	}

	public void realizarOperacion(TipoOperacion tipoOperacion, double porcentaje){
		this.companiaObservable.setTipoOperacion(tipoOperacion);
		this.companiaObservable.setPorcentaje(porcentaje);
		this.companiaObservable.setChanged();
		this.companiaObservable.notifyObservers();
	}
}
