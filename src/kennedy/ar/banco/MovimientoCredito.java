package kennedy.ar.banco;

import java.util.Date;

public class MovimientoCredito extends Movimiento{

	public MovimientoCredito(Date fecha, double monto) {
		super.setFecha(fecha);
		super.setMonto(monto);
		super.setTipo(Movimiento.CREDITO);

	}
	
}
