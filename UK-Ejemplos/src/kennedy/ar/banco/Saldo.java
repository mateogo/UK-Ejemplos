package kennedy.ar.banco;

import java.util.Iterator;
import java.util.List;

public class Saldo {
	
	private double montoDebito;
	private double montoCredito;
	private List<Movimiento> movimientos;
	
	public Saldo() {
		this.montoCredito=0;
		this.montoDebito=0;
	}
	public Saldo(List<Movimiento> movimCuenta) {
		this();
		this.setMovimientos(movimCuenta);
		this.computeSaldo();
	}
	
	public void agregarMovimiento(Movimiento movimiento){
		switch (movimiento.getTipo()) {
		case Movimiento.DEBITO:
			this.montoDebito+=movimiento.getMonto();
			break;
		case Movimiento.CREDITO:
			this.montoCredito+=movimiento.getMonto();
			break;
		}
		
	}
	public void computeSaldo(){
		this.montoCredito=0;
		this.montoDebito=0;
		Iterator<Movimiento> it= this.getMovimientos().iterator();
		while(it.hasNext()){
			this.agregarMovimiento(it.next());
		}
	}

	public double getMontoDebito() {
		return montoDebito;
	}

	public double getMontoCredito() {
		return montoCredito;
	}

	public double getSaldo() {
		return this.getMontoCredito()-this.getMontoDebito();
	}
	public List<Movimiento> getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}
}
