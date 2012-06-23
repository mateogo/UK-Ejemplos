public class Alumno extends Socio {
	private int curso;
		
	public Alumno(String nom,String ape, int dni, String dir, int cur){
		super(nom, ape, dni, dir);
		this.curso = cur;
	}
	
	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}
}
