package kennedy.ar.banco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco implements EntidadFinanciera {
	private int numero;
	private String cuit;
	private String nombre;
	private String direccion;
	private String telefono;
	private List<Sucursal> sucursales;
	
	
	
	public Banco(int numero, String cuit, String nombre, String direccion,
			String telefono) {
		super();
		this.numero = numero;
		this.cuit = cuit;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.initBanco();
	}
	private void initBanco(){
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public List<Sucursal> getSucursales() {
		return sucursales;
	}
	public void setSucursales(List<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}
	public void agregarSucursal(Sucursal sucursal){
		if(this.sucursales==null){
			this.sucursales= new ArrayList<Sucursal>();
		}
		this.sucursales.add(sucursal);
	}

	public String getInformacion(){
		StringBuffer sb= new StringBuffer();
		sb.append("Banco:" + this.getNombre());
		sb.append(" tiene " + this.getSucursales().size() + " sucursales: \n");
		Iterator<Sucursal> it= this.getSucursales().iterator();
		while(it.hasNext()){
			sb.append(it.next().getInformacion() + "\n");
		}
		return sb.toString();
	}

	
	
}
