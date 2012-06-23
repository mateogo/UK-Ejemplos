public class Profesor extends Socio {
	String asignatura;
	
	public Profesor(String nom,String ape, int dni, String dir, int cur, String asig){
		super(nom, ape, dni, dir);
		this.asignatura = asig;
	}
	
	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
}
