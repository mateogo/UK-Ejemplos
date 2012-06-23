package kennedy.ar.ui.ejemplos;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import org.apache.log4j.spi.LoggerRepository;
import org.apache.log4j.BasicConfigurator;

import org.apache.log4j.FileAppender;
import org.apache.log4j.SimpleLayout;

public class Log4JExample {
	//Variantes para invocar un logger
	//static final Logger logger = Logger.getLogger("kennedy.ar.ui.ejemplos.Log4JExample");
	static final Logger mailLogger = Logger.getLogger("mail");
	static final Logger appLogger = Logger.getLogger("app");
	static final Logger dbLogger = Logger.getLogger("app.db");
	static final Logger thisLogger = Logger.getLogger(Log4JExample.class);
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (i)Configuraci—n del LOG
		BasicConfigurator.configure();
		
		// (ii)Establecer el nivel de verbosidad
		mailLogger.setLevel(Level.WARN);
		appLogger.setLevel(Level.ERROR);
		//thisLogger.setLevel(Level.ERROR);
		
		// (ii) Se puede establecer el nivel directamente en el repositorio
		LoggerRepository logRepo = appLogger.getLoggerRepository();
		logRepo.setThreshold(Level.ALL);
	
		// (iii) usar el logger
		mailLogger.debug("Hellouuuuuuu: debugueando DEBUG");
		mailLogger.info ("Hellouuuuuuu: te paso una INFO");
		mailLogger.warn ("Hellouuuuuuu: atenti, atenti... WARN");
		mailLogger.error("Hellouuuuuuu: oops! un ERROR");
		mailLogger.fatal("Hellouuuuuuu: Llamen a los bomberos: FATAL");

		dbLogger.debug("Hellouuuuuuu: debugueando DEBUG");
		dbLogger.info ("Hellouuuuuuu: te paso una INFO");
		dbLogger.warn ("Hellouuuuuuu: atenti, atenti... WARN");
		dbLogger.error("Hellouuuuuuu: oops! un ERROR");
		dbLogger.fatal("Hellouuuuuuu: Llamen a los bomberos: FATAL");

		thisLogger.debug("Hellouuuuuuu: debugueando DEBUG");
		thisLogger.info ("Hellouuuuuuu: te paso una INFO");
		thisLogger.warn ("Hellouuuuuuu: atenti, atenti... WARN");
		thisLogger.error("Hellouuuuuuu: oops! un ERROR");
		thisLogger.fatal("Hellouuuuuuu: Llamen a los bomberos: FATAL");
		
		/*************************************************/
		/**
		 * USO DE APPENDERS
		 * 
		 */
		try {
			FileAppender outputLog = new FileAppender(new SimpleLayout(), "data/outputLog.log");
			//Logger root = Logger.getRootLogger();
			//root.addAppender(outputLog);
			appLogger.addAppender(outputLog);
			appLogger.error("Iajuuuuu: Soy appLogger: esto se escribe en el output");
			appLogger.error("Iajuuuuu: Soy  dbLogger: esto se escribe en el output");
			thisLogger.warn("Iajuuuuuu: Soy thisLogger: Esto (NO) se escribe en el outputLog");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
