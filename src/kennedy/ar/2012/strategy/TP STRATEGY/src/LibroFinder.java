import java.sql.SQLException;
import java.util.ArrayList;

public class LibroFinder{

	ArrayList<Libro> librosResultado = null;
	public LibroFinder() {
		// TODO Auto-generated constructor stub
	}
	public void findLibro(Socio socio,DatoBusqueda dato) throws ClassNotFoundException, SQLException
	{
		
		if(socio instanceof Alumno)
		{
			int curso=(((Alumno) socio).getCurso());
			BusquedaPorAlumno bus= new BusquedaPorAlumno();
			librosResultado=bus.findLibro(Integer.toString(curso), dato);
		}
		
		if(socio instanceof Profesor)
		{
			BusquedaPorProfesor bus= new BusquedaPorProfesor();
			librosResultado=bus.findLibro("", dato);
		}
		
		
		for(int i=0;i<librosResultado.size();i++)
		{
			System.out.println(librosResultado.get(i)+"\n");
		}
	}
}