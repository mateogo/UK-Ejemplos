package kennedy.ar.banco;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class TrxManager implements Subject {

	private static TrxManager trxManagerSingleton;
	private ArrayList<Observer> observers;
	private Sucursal sucursal;
	private Movimiento elMovimiento;
	private Cuenta laCuenta;


	private TrxManager(){
		observers=new ArrayList<Observer>();
		System.out.println("Un TrsManager se creo");

	}


	public void suscribeObserver(Observer unObservador) {
		// TODO Auto-generated method stub
		this.observers.add(unObservador);
	}
	public void unSuscribeObserver(Observer unObservador) {
		// TODO Auto-generated method stub
		this.observers.remove(unObservador);
	}
	public void notifyEvent() {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer();
		sb.append("NotificoEnventos a:");
		System.out.println(sb.toString());
		Iterator<Observer> it= this.observers.iterator();
		while(it.hasNext()){
			it.next().update(this);
		}
	}


	public static TrxManager getInstance(){
		if (TrxManager.trxManagerSingleton == null){
			synchronized (TrxManager.class) { //1
				if (TrxManager.trxManagerSingleton == null){ //2
					TrxManager.trxManagerSingleton= new TrxManager();
				}
			}
		}
		return TrxManager.trxManagerSingleton;
	}
	public void addMovimientoDebito(Date fecha, String cuentaNro, double monto){
		Boolean exito = false;
		laCuenta = getSucursal().getCuenta(cuentaNro);
		System.out.println("****** testCuenta ********");		
		if(laCuenta!=null){
			System.out.println(laCuenta.getInformacion());
			elMovimiento= new MovimientoDebito(fecha, monto);
			laCuenta.agregarMovimiento(elMovimiento);
			exito=true;
			this.notifyEvent();
		}
		System.out.println("****** testCuenta:Concluyo con "+exito+" *****");
			
		
	}
	public void addMovimientoCredito(Date fecha, String cuentaNro, double monto){
		Boolean exito = false;
		laCuenta = getSucursal().getCuenta(cuentaNro);
		System.out.println("****** testCuenta ********");		
		if(laCuenta!=null){
			System.out.println(laCuenta.getInformacion());
			elMovimiento= new MovimientoCredito(fecha, monto);
			laCuenta.agregarMovimiento(elMovimiento);
			exito=true;
			this.notifyEvent();
		}
		System.out.println("****** testCuenta:Concluyo con "+exito+" *****");
			
		
	}

	public Sucursal getSucursal() {
		return sucursal;
	}


	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}


}
