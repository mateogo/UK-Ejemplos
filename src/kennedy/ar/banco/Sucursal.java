package kennedy.ar.banco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sucursal implements EntidadFinanciera {

	private int numero;
	private String direccion;
	private String telefono;
	private Afip afip;
	private OficialDeCuenta oficial;
	private TrxManager trxManager;
	private List<Cuenta> cuentas;
	
	
	public Sucursal(int numero, String direccion, String telefono) {
		super();
		this.numero = numero;
		this.direccion = direccion;
		this.telefono = telefono;
		this.initSucursal();
	}
	private void initSucursal(){
		cuentas= new ArrayList<Cuenta>();
		afip = new Afip();
		oficial = new OficialDeCuenta();
		trxManager = TrxManager.getInstance();
		trxManager.suscribeObserver(afip);
		trxManager.suscribeObserver(oficial);
		trxManager.setSucursal(this);
		
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<Cuenta> getCuentas(){
		return this.cuentas;
	}
	public void agregarCuenta(Cuenta cuenta){
		this.getCuentas().add(cuenta);
	}
	
	public String getInformacion(){
		StringBuffer sb= new StringBuffer();
		sb.append("Sucursal: " + this.getNumero() + "\n");
		sb.append("tiene " + this.getCuentas().size() + " cuentas:\n");
		Iterator<Cuenta> it= this.getCuentas().iterator();
		while(it.hasNext()){
			Cuenta cuenta= it.next();
			sb.append(cuenta.getInformacion() + " con saldo: " + cuenta.getSaldo().getSaldo() + "\n");
		}
		return sb.toString();
	}
	public Cuenta getCuenta(String nroCuenta){
		Iterator<Cuenta> it= this.getCuentas().iterator();
		while(it.hasNext()){
			Cuenta cuenta= it.next();
			if(cuenta.getNumero()==nroCuenta){
				//bingo!
				return cuenta;				
			}
		}
		return null;
	}


}
