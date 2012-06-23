import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, SQLException, ClassNotFoundException {
		
		String valorBusqueda="Lemings";
		
		DatoBusqueda dato=new DatoBusqueda("", "Lemings", "");
		
		LibroFinder finder,finder2;
		
		//Prueba Profesor
		//finder=new LibroFinder();
		//finder.findLibro(new Profesor(valorBusqueda, valorBusqueda, 0, valorBusqueda, 0, valorBusqueda),dato);
		
		//Prueba Alumno
		finder2=new LibroFinder();
		finder2.findLibro(new Alumno(valorBusqueda, valorBusqueda, 0, valorBusqueda, 7), dato);
	}
}
