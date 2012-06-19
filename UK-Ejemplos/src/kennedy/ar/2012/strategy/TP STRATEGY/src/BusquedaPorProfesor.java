import java.sql.*;
import java.util.ArrayList;

public class BusquedaPorProfesor implements BuscaLibroStrategy
{
	Connection con;
	String[]resultados ;
	ArrayList<Libro> libros;
	
	@Override
	public ArrayList<Libro> findLibro(String condicion,DatoBusqueda dato) throws ClassNotFoundException, SQLException
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con = DriverManager.getConnection("jdbc:odbc:Biblioteca");
		String sql = "SELECT * FROM LIBROS";
		String sqlwhere="";
		String primero="";
		
		// busqueda por autor
		if(dato.getAutor().toString()!= "")
		{
			sqlwhere+=" WHERE Autor LIKE '%" + dato.getAutor().toString()+"%'";
			primero="N";
		}
		
		// busqueda por titulo
		if(dato.getTitulo().toString()!= "")
		{
			if(primero=="")
			{
				sqlwhere+=" WHERE Titulo LIKE '%" + dato.getTitulo().toString()+"%'";
				primero="N";
			}
			else sqlwhere+=" AND Titulo LIKE '%" + dato.getTitulo().toString()+"%'";
		}	
		
		// busqueda por clave
		if(dato.getClave().toString()!= "")
		{
			if(primero=="")
			{
				sqlwhere+=" WHERE Claves LIKE '%" + dato.getClave().toString()+"%'";
				primero="N";
			}
			else sqlwhere+=" AND Claves LIKE '%" + dato.getClave().toString()+"%'";
		}	
		
		if(sqlwhere!="")
		{
			sql+=sqlwhere.toString();
		}
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		resultados = new String[10];
		ArrayList<Libro> libros = new ArrayList<Libro>();
		while(rs.next())
		{			
			libros.add(new Libro(rs.getString("Titulo"), rs.getString("Autor"), Integer.parseInt(rs.getString("curso")), rs.getString("Claves")));
		}
	rs.close();
	con.close();
	return libros;
	
	}

}