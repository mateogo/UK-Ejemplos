package kennedy.ar.banco;

import java.util.Date;

public abstract class Movimiento {
	
	public static final int DEBITO=-1;
	public static final int CREDITO=1;

	private double monto;
	private Date fecha;
	private int tipo;
	
	
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public double montoAlCliente(){
		return this.getMonto()*this.getTipo();
	}
	
	
	
	
	
	
}
