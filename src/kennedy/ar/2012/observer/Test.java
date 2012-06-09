import java.util.ArrayList;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		List<LineaClaro> lineas = new ArrayList<LineaClaro>();
		
		lineas.add(new LineaClaro("15-1029-6433", 100));
		lineas.add(new LineaClaro("15-5677-9944", 200));
		lineas.add(new LineaClaro("15-2446-9325", 300));
		
		CompaniaClaro companiaClaro = new CompaniaClaro(lineas);
		
		System.out.println("\n*******************SALDOS ORIGINALES******************\n");
		
		for(LineaClaro l : lineas){
			System.out.println(l);
			System.out.println("------------------------------------------------------");
		}
		
		System.out.println("\n******************SE ACREDITA EL 10 %*****************\n");
		
		companiaClaro.realizarOperacion(TipoOperacion.CREDITO, 10);
		
		for(LineaClaro l : lineas){
			System.out.println(l);
			System.out.println("------------------------------------------------------");
		}
		
		System.out.println("\n******************SE DEBITA EL 50 %*******************\n");
		
		companiaClaro.realizarOperacion(TipoOperacion.DEBITO, 50);
		
		for(LineaClaro l : lineas){
			System.out.println(l);
			System.out.println("------------------------------------------------------");
		}

	}

}
