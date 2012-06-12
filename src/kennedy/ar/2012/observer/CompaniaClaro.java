import java.util.List;

import org.apache.log4j.Logger;


public class CompaniaClaro extends Compania {

	private static Logger logger = Logger.getLogger(CompaniaClaro.class);
	
	public CompaniaClaro(List<LineaClaro> lineas) {
		super(lineas);
		
		logger.info("Se agregaron todos los observers al Observable: "+this.toString());
	}
	
	public String toString() {
		
		return("CompaniaClaro");
		
	}
	
}
