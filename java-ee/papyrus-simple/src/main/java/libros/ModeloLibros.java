package libros;

import java.sql.*;
import java.util.*;

import javax.sql.DataSource;

public class ModeloLibros
{
	private DataSource ds;
	
	public ModeloLibros(DataSource ds)
	{
		this.ds = ds;
	}
	
	public List<Libro> getLibros() throws Exception
	{
		List<Libro> libros = new ArrayList<>();
		String titulo, autor, categoria;
		int anio;
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		con = ds.getConnection();
		st = con.createStatement();
		String sql = "SELECT * FROM papyrus.libro;";
		rs = st.executeQuery(sql);
		
		while(rs.next())
		{
			titulo = rs.getString("titulo");
			anio = rs.getInt("anio");
			autor = rs.getString("autor");
			categoria = rs.getString("categoria");
		
			Libro temLibro = new Libro(titulo, autor, anio, categoria);
			
			libros.add(temLibro);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return libros;
	}
}
