public class Socio {

	String nombre;
	String apellido;
	int dni;
	String direccion;
	public Socio(String nom,String ape, int dni, String dir)
	{
		this.nombre=nom;
		this.apellido=ape;
		this.dni=dni;
		this.direccion=dir;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
