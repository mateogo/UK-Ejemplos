/*
 * PruebaForte.java
 *
 * Created on 6 de mayo de 2001, 18:04
 */
package kennedy.ar.colecciones.properties;

/**
 *
 * @author  grupo
 * @version
 */
import java.io.*;
import java.util.*;
//import java.lang.*;

public class LoadProperiesFromFile {
    Properties prop;
    String row;
    String propertiesFile ="./data/properties";
    
    /** Creates new PruebaForte */
    public LoadProperiesFromFile() {       
        prop = new Properties();
        
    } // constructor
    public void loadProperties(){
        try {
            FileInputStream f    = new FileInputStream(propertiesFile);
            prop.load(f);
            ////////////////////////////////////////////////////////////////
            // las lineas comentadas muestran lo que realiza el metodo load()
            /////////////////////////////////////////////////////////////////
            //    InputStreamReader ir = new InputStreamReader(f);
            //    BufferedReader    in = new BufferedReader(ir);
            //   while ( (row = in.readLine()) != null ) {
            //     String key = new String();
            //     String value = new String();
            //     StringTokenizer aTokenizer = new StringTokenizer(row,"=");
            //     key   = aTokenizer.nextToken();
            //     value = aTokenizer.nextToken();
            //     prop.put(key, value);
            //   }
            //   in.close();
            //   ir.close();
            f.close();
            
        }catch (java.io.IOException e){}
    }
    public void printProperties(){
   //       prop.save(System.out,"Variables de entorno");
        for(@SuppressWarnings("rawtypes")
		Enumeration e = prop.propertyNames(); e.hasMoreElements();){
            String salidaKey = (String)e.nextElement();
            System.out.print(salidaKey+": ");
            String salidaValue = prop.getProperty(salidaKey);
            System.out.println(salidaValue);           
        }          
    }
    public static void main (String []args){
        try {
            LoadProperiesFromFile pru = new LoadProperiesFromFile();
            pru.loadProperties();
            pru.printProperties();
        }catch(Exception e){}
    }
 
}