package kennedy.ar.banco;

import java.util.Date;
import java.util.Iterator;

public class TestingEntities {
		Banco elBanco; 
		
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
		
		TestingEntities testBanco = new TestingEntities();
		testBanco.init();
		testBanco.test001();
	}
	public void test001(){
		System.out.println("El banco es:" + this.elBanco.getNombre());
		System.out.println("con cuit:" + this.elBanco.getCuit());
		System.out.println("Telefono:" + this.elBanco.getTelefono());
		System.out.println("Sucursales:" + this.elBanco.getSucursales());
		
	}
	public void init(){
		//Banco
		elBanco= new Banco(901, "22-2222222-2", "Santander Rio","", "4444-4444");
	}
}
