import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class CompaniaClaroTest {
	
	private CompaniaClaro companiaClaro;
	private List<LineaClaro> lineasClaro;
	
	@Before
	public void setUp() throws Exception {
		this.lineasClaro = new ArrayList<LineaClaro>();
		
		this.lineasClaro.add(new LineaClaro("15-1029-6433"));
		this.lineasClaro.add(new LineaClaro("15-5677-9944"));
		this.lineasClaro.add(new LineaClaro("15-2446-9325"));
			
		this.companiaClaro = new CompaniaClaro(lineasClaro);
	}
/*
	@Test
	public void testRealizarOperacionCredito() {
		companiaClaro.realizarOperacion(TipoOperacion.CREDITO, 10);
		assertTrue(((LineaClaro)lineasClaro.get(0)).getSaldo() == 110);
		assertTrue(((LineaClaro)lineasClaro.get(1)).getSaldo() == 220);
		assertTrue(((LineaClaro)lineasClaro.get(2)).getSaldo() == 330);
	}
	
	@Test
	public void testRealizarOperacionDebito() {
		companiaClaro.realizarOperacion(TipoOperacion.DEBITO, 50);
		assertTrue(((LineaClaro)lineasClaro.get(0)).getSaldo() == 50);
		assertTrue(((LineaClaro)lineasClaro.get(1)).getSaldo() == 100);
		assertTrue(((LineaClaro)lineasClaro.get(2)).getSaldo() == 150);
	}
*/
}
