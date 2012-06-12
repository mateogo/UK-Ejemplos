import java.text.DecimalFormat;
import java.util.Observable;


public class LineaClaro extends Linea {

	public LineaClaro(String nroLinea, double saldo) {
		super(nroLinea, saldo);
	}

	@Override
	public void update(Observable observable, Object arg1) {
		CompaniaObservable companiaObservable = (CompaniaObservable) observable;
		
		double proporcion = companiaObservable.getPorcentaje() / 100;
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		if(companiaObservable.getTipoOperacion().equals(TipoOperacion.CREDITO)){
			this.setSaldo(Double.parseDouble(df.format(this.getSaldo() * (1 + proporcion))));
		}else if (companiaObservable.getTipoOperacion().equals(TipoOperacion.DEBITO)){
			this.setSaldo(Double.parseDouble(df.format(this.getSaldo() * (1 - proporcion))));
		}
	}

	@Override
	public String toString() {
		return "Nro. Linea: " + this.getNroLinea() + ", Saldo: $ " + this.getSaldo();
	}
	
}
