import java.util.List;
import org.apache.log4j.Logger;

public class CompaniaClaro extends Compania {
	private static Logger logger = Logger.getLogger(CompaniaClaro.class);
	
	public CompaniaClaro(List<LineaClaro> lineas) {
		super(lineas);
		logger.info("Compania Creada: " + this.toString());
	}
	
	public String toString() {
		return this.getClass().getName();
	}
	
}
