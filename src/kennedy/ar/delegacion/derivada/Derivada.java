/*
 * Derivada.java
 *
 * Created on 4 de abril de 2001, 10:05
 */

package kennedy.ar.delegacion.derivada;

/**
 *
 * @author  mateo
 * @version 
 */
public class Derivada extends Object {
    double x1,x2,dx;
    FunMatematicas fx;
    /** Creates new Derivada */
    public Derivada(FunMatematicas targetFun) {
        fx= targetFun;
    }
    public double getLaDerivada(double x){
        double dx,y1,y2,derivada;
        dx=.0001;
        x1= x;
        y1= (double) fx.getY(x1-dx);
        y2= (double) fx.getY(x1+dx);
        
        derivada= (y2-y1) /(2*dx);
        return derivada;
    }
    
}