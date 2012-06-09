import java.util.Observable;
import java.util.Observer;


public class Linea implements Observer {
	private String nroLinea;
	private double saldo;
	
	public Linea(String nroLinea, double saldo) {
		this.nroLinea = nroLinea;
		this.saldo = saldo;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	public String getNroLinea() {
		return nroLinea;
	}

	public void setNroLinea(String nroLinea) {
		this.nroLinea = nroLinea;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
		
}
