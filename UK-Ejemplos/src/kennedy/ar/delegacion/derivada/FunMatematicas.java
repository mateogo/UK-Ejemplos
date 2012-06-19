/*
 * FunMatematicas.java
 *
 * Created on 3 de abril de 2001, 20:04
 */

package kennedy.ar.delegacion.derivada;

/**
 *
 * @author  mateo
 * @version
 */
public class FunMatematicas extends Object {
    double x,y;
    /** Creates new FunMatematicas */
    public FunMatematicas() {

    }

    public double getY(double x){
        y= x;
        System.out.println(toString()+": f("+x+") = ["+y+"]");
        return y;
    }

    public String toString(){
        return ("Función Genérica f(x) = x ");
    }



}