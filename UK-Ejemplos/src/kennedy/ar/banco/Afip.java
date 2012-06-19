package kennedy.ar.banco;

public class Afip implements Observer {
	String name = "Afip";

	public Afip(){
		
	}
	
	public void update(Object novedad) {
		// TODO Auto-generated method stub
		System.out.println(getName()+": ya veras, pillo");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		return getName();
		
	}

}
