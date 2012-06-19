/*
 * FunIdentidad.java
 *
 * Created on 4 de abril de 2001, 0:05
 */

package kennedy.ar.delegacion.derivada;

/**
 *
 * @author  mateo
 * @version
 */
public class FunIdentidad extends FunMatematicas {
    double y,x;
    /** Creates new FunIdentidad */
    public FunIdentidad() {
    }

    public double getY(double x){
        y= x;
        System.out.println(toString()+": f("+x+") = ["+y+"]");
        return y;
    }

    public String toString(){
        return ("Fun.Identidad f(x) = x ");
    }


}