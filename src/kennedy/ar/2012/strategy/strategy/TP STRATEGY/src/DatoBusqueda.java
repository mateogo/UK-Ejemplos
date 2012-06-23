
public class DatoBusqueda 
{
	private String titulo;
	private String autor;
	private String clave;
	
	public DatoBusqueda(String titulo, String autor, String clave) {
		this.titulo = titulo;
		this.autor = autor;
		this.clave = clave;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
}
