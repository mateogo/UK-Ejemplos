package kennedy.ar.banco;

public class CajaDeAhorro extends Cuenta {

	public CajaDeAhorro(String numero, String moneda) {
		super(numero, moneda);
	}

	@Override
	public String getInformacion() {
		
		return "Caja de Ahorros en " + super.getMoneda() + " nro: " + super.getNumero() + "Saldo: " + this.getSaldo().getSaldo();
	}
}
