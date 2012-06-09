import java.util.Observable;


public class LineaClaro extends Linea {

	public LineaClaro(String nroLinea, double saldo) {
		super(nroLinea, saldo);
	}

	@Override
	public void update(Observable observable, Object arg1) {
		CompaniaObservable companiaObservable = (CompaniaObservable) observable;
		
		double proporcion = companiaObservable.getPorcentaje() / 100;
		
		if(companiaObservable.getTipoOperacion().equals(TipoOperacion.CREDITO)){
			this.setSaldo(this.getSaldo() * (1 + proporcion));
		}else if (companiaObservable.getTipoOperacion().equals(TipoOperacion.DEBITO)){
			this.setSaldo(this.getSaldo() * (1 - proporcion));
		}
	}

	@Override
	public String toString() {
		return "Nro. Linea: " + this.getNroLinea() + ", Saldo: $ " + this.getSaldo();
	}
	
}
