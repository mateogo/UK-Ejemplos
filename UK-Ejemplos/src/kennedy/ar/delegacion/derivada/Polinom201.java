/*
 * Polinom201.java
 *
 * Created on 3 de abril de 2001, 23:48
 */

package kennedy.ar.delegacion.derivada;
//import java.lang.Math.*;

/**
 *
 * @author  mateo
 * @version 
 */
public class Polinom201 extends FunMatematicas {
    double x,y;
    /** Creates new Polinom201 */
    public Polinom201() {
    }
    public double getY(double x){
        //y=java.lang.Math.pow((double)x,(double)2);
        y= Math.pow(x, (double)2) * 4 + 7;
        System.out.println(toString()+": f("+x+") = ["+y+"]");
        return y;
    }
    public String toString(){
        return ("f(x) = 4 * (x^2) + 7 ");
    }
}