package kennedy.ar.banco;

import java.util.Date;

public class MovimientoDebito extends Movimiento{

	public MovimientoDebito(Date fecha, double monto) {
		super.setFecha(fecha);
		super.setMonto(monto);
		super.setTipo(Movimiento.DEBITO);

	}
	
}
