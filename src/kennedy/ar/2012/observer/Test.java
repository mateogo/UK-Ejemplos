import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<LineaClaro> lineas = new ArrayList<LineaClaro>();
		
		lineas.add(new LineaClaro("15-1029-6433"));
		lineas.add(new LineaClaro("15-5677-9944"));
		lineas.add(new LineaClaro("15-2446-9325"));

		CompaniaClaro companiaClaro = new CompaniaClaro(lineas);
		
		companiaClaro.enviarMensaje(TipoAviso.CORTE);
		companiaClaro.enviarMensaje(TipoAviso.PROMOCION);
	}

}
