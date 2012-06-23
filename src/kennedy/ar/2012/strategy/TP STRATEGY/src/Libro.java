
public class Libro {
	private String titulo;
	private String autor;
	private int curso;
	private String clave;
	
	public Libro(String tit,String aut, int cur,String clave){
		this.titulo = tit;
		this.autor=aut;
		this.curso = cur;
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

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}


	public String toString(){
		return "TITULO: "+getTitulo()+" AUTOR:"+getAutor()+" CURSO: "+getCurso();
	}
}
