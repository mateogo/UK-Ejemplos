package kennedy.ar.banco;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;



public abstract class Cuenta {
	public static final String MONEDA_DOLAR="Dolares";
	public static final String MONEDA_PESO="Pesos";
	public static final String MONEDA_EURO="Euro";
	
	private String numero;
	private String moneda;
	private List<Movimiento> movimientos;
	
	
	public Cuenta(String numero, String moneda) {
		super();
		this.numero = numero;
		this.moneda = moneda;
		this.movimientos=new ArrayList<Movimiento>();
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	public List<Movimiento> getMovimientos(){
		return this.movimientos;
	}
	public void agregarMovimiento(Movimiento movimiento){
		this.getMovimientos().add(movimiento);
	}
	
	public Saldo getSaldo(){
		Saldo saldo= new Saldo(getMovimientos());
		return saldo;
	}
	
	
	public abstract String getInformacion();

}
