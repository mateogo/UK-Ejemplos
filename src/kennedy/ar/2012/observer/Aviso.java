import java.util.HashMap;
import java.util.Map;

public class Aviso {
	private Map<TipoAviso, String> mapaAvisos;
	private TipoAviso tipoAvisoActual;

	public Aviso() {
		this.mapaAvisos = new HashMap<TipoAviso, String>();
		recuperarAvisosBD();
	}
		
	// simula levantar de una BD los avisos disponibles
	private void recuperarAvisosBD(){
		this.mapaAvisos.put(TipoAviso.CORTE, "Corte programado por mantenimiento el 19/05/2012 a las 15 hs");
		this.mapaAvisos.put(TipoAviso.PROMOCION, "Por este mes, descuento del 10% en tu Volkswagen 0 km pagando de contado");
	}
	
	// devuelve el mensaje correspondiente al aviso que se desea enviar
	public String getMensajeTipoAvisoActual(){
		return this.mapaAvisos.get(tipoAvisoActual);
	}
	
	public void setTipoAvisoActual(TipoAviso tipoAviso){
		this.tipoAvisoActual = tipoAviso;
	}
	
}
