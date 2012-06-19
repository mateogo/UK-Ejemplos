package kennedy.ar.banco;

public class OficialDeCuenta implements Observer {
	public String name="Oficial de Cuentas";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void update(Object novedad) {
		// TODO Auto-generated method stub
		System.out.println(getName()+": estoy para conrolarte, bribon");

	}

}
