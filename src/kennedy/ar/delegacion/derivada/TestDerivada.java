/*
 * Testing.java
 *
 * Created on 3 de abril de 2001, 20:33
 */

package kennedy.ar.delegacion.derivada;

/**
 * 
 * @author mateo
 * @version
 */
public class TestDerivada extends Object {
	private FunMatematicas fx;

	/** Creates new Testing */
	public TestDerivada() {
		ensayo2();
		// ensayo1();
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		new TestDerivada();
	}

	public void ensayo1() {
		double x = 4;
		// fx= new Polinom201();
		fx = new FunIdentidad();
		System.out.println("x: [" + x + "] Evalua a> [" + fx.getY(x) + "]");
	}

	public void ensayo2() {
		Derivada fdx;
		float dfx;
		double x = 4;
		fx= new Polinom201();
		//fx = new FunIdentidad();
		fdx = new Derivada(fx);
		dfx = Math.round(fdx.getLaDerivada(x));
		System.out.println("La derivada de: [" + fx.toString() + "] / x:[" + x
				+ "] Evalua a> [" + dfx + "]");
		Class c = fdx.getClass();
		System.out.println("Clase de la clase: " + c.getName());
		System.out.println("Es primitiva? :" + c.isPrimitive());
		c = fx.getClass();
		System.out.println("Clase de la clase: " + c.getName());
		System.out.println("Es primitiva? :" + c.isPrimitive());
	}

}