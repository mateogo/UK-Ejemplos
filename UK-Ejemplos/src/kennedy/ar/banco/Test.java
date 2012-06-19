package kennedy.ar.banco;

import java.util.Date;
import java.util.Iterator;

public class Test {
		Banco elBanco; 
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
		
		Test testBanco = new Test();
		testBanco.init();
		//testBanco.testIT();
		testBanco.testing();
	}

	public void testing(){
		System.out.println("El banco es:" + this.elBanco.getNombre());
		System.out.println("con cuit:" + this.elBanco.getCuit());
		System.out.println("Telefono:" + this.elBanco.getTelefono());
		System.out.println("Sucursales:" + this.elBanco.getSucursales());
		Iterator<Sucursal> iteradorSucursales= this.elBanco.getSucursales().iterator();
		while(iteradorSucursales.hasNext()){
			Sucursal sucursal= iteradorSucursales.next();
			System.out.println("Sucursal:"+ sucursal.getNumero());
			Iterator<Cuenta> iteradorCuentas= sucursal.getCuentas().iterator();
			while(iteradorCuentas.hasNext()){
				Cuenta cuenta= iteradorCuentas.next();
				System.out.println("Cuenta:"+ cuenta.getInformacion());
				TrxManager.getInstance().addMovimientoDebito(new Date(), cuenta.getNumero(), 10);
				
				System.out.println("Cuenta:"+ cuenta.getInformacion());
			}
		}
		
		
	}
		
	
	public void init(){
		//Banco
		elBanco= new Banco(901, "22-2222222-2", "Santander Rio","", "4444-4444");

		//Sucursal
		Sucursal sucursalBelgranoSantanderRio= new Sucursal(1, "Av. Belgrano 2235", "4321-1234");
		//Agrego la sucursal al banco
		elBanco.agregarSucursal(sucursalBelgranoSantanderRio);

		//Genero una cuentas
		CajaDeAhorro cajaDeAhorroPedro= new CajaDeAhorro("121212",Cuenta.MONEDA_PESO);
		CuentaCorriente cuentaCorrienteJuan= new CuentaCorriente("232323",Cuenta.MONEDA_DOLAR);
		//agrego las cuentas a la sucursal
		sucursalBelgranoSantanderRio.agregarCuenta(cajaDeAhorroPedro);
		sucursalBelgranoSantanderRio.agregarCuenta(cuentaCorrienteJuan);

		//Movimientos sobre las cuentas
		cajaDeAhorroPedro.agregarMovimiento(new MovimientoCredito(new Date(), 10.50));
		cajaDeAhorroPedro.agregarMovimiento(new MovimientoDebito(new Date(), 100));
		cuentaCorrienteJuan.agregarMovimiento(new MovimientoCredito(new Date(), 11));
		cuentaCorrienteJuan.agregarMovimiento(new MovimientoDebito(new Date(), 2.43));

	}
	public void testIT(){
		System.out.println(elBanco.getInformacion());
		String cuentaNro="121212";
		double monto= 1000;
		System.out.println("Vamos a usar un TxMg");
		TrxManager trx = TrxManager.getInstance();
		System.out.println("Tengo una instancia del TxMg");
		trx.addMovimientoDebito(new Date(), cuentaNro, monto);
		testCuenta(trx.getSucursal(),cuentaNro);
//		trx.notifyEvent();
	}
	
	public void testCuenta(Sucursal sucu, String cuentaNro){
		Cuenta cuenta = sucu.getCuenta(cuentaNro);
		System.out.println("****** testCuenta ********");
		
		if(cuenta!=null){
			System.out.println(cuenta.getInformacion()+"con saldo:"+cuenta.getSaldo().getSaldo());
		}else{
			System.out.println("CuentaNoEncontrada");
			
		}
		System.out.println("****** testCuenta:Fin *****");
	}
}
