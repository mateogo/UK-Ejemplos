import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class LineaClaroTest {

	private CompaniaClaro companiaClaro;
	private LineaClaro lineaClaro;
	
	@Before
	public void setUp() throws Exception {
		this.lineaClaro = new LineaClaro("15-1029-6433", 100);
		
		List<LineaClaro> lineasClaro = new ArrayList<LineaClaro>();
		lineasClaro.add(this.lineaClaro);
		
		this.companiaClaro = new CompaniaClaro(lineasClaro);
	}
	
	@Test
	public void testUpdateCredito() {
		companiaClaro.realizarOperacion(TipoOperacion.CREDITO, 10);
		assertTrue(this.lineaClaro.getSaldo() == 110);
	}
	
	@Test
	public void testUpdateDebito() {
		companiaClaro.realizarOperacion(TipoOperacion.DEBITO, 50);
		assertTrue(this.lineaClaro.getSaldo() == 50);
	}
	
	@Test
	public void testGetNroLinea() {
		assertTrue(this.lineaClaro.getNroLinea().equals("15-1029-6433"));
	}
	
	@Test
	public void testGetSaldo() {
		assertTrue(this.lineaClaro.getSaldo() == 100);
	}

}
