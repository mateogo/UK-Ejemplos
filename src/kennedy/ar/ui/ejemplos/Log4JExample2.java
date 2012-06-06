package kennedy.ar.ui.ejemplos;

import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import org.apache.log4j.PropertyConfigurator;

public class Log4JExample2 {
	final static Logger appLogger = Logger.getLogger("kennedy.ar.ui");
	private 
	final String LOCATION = "./data/log4j.properties";
	
	
	public Log4JExample2(){
		PropertyConfigurator.configure(LOCATION);
		//appLogger.setLevel(Level.WARN);
	}
	public void init(){
		appLogger.info("Helouuu: inicializando variables");
		ShareModel smodel = new ShareModel();
		smodel.printInfo();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log4JExample2 l4j = new Log4JExample2();
		l4j.init();
	}
}
