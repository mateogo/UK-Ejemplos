import java.util.Observable;
import java.util.Observer;

public class Linea implements Observer {
	private String nroLinea;
			
	public Linea(String nroLinea) {
		this.nroLinea = nroLinea;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
	}

	public String getNroLinea() {
		return nroLinea;
	}

	public void setNroLinea(String nroLinea) {
		this.nroLinea = nroLinea;
	}
		
}
