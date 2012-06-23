import java.sql.SQLException;
import java.util.ArrayList;



public interface BuscaLibroStrategy {

	public ArrayList<Libro> findLibro(String condicion,DatoBusqueda dato) throws NumberFormatException, SQLException, ClassNotFoundException;
}
