package kennedy.ar.banco;

public class CuentaCorriente extends Cuenta{
	
	private double descubierto;

	public CuentaCorriente(String numero, String moneda) {
		super(numero, moneda);
		this.descubierto=0;		
	}
	public CuentaCorriente(String numero, String moneda, double descubierto) {
		super(numero, moneda);
		this.descubierto=descubierto;
	}

	@Override
	public String getInformacion() {
		return "Cuenta corriente en " + super.getMoneda() + " nro: " + super.getNumero() + " descubierto asignado: " + this.getDescubierto() + "Saldo: " + this.getSaldo().getSaldo();
	}
	public double getDescubierto() {
		return descubierto;
	}
	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}

}
