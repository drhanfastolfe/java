package libros;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/ServletPrueba")
public class ServletPrueba extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    
	@Resource(name="jdbc/papyrus_simple")
	private DataSource ds;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/plain");
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try
		{
			String sql = "SELECT * FROM papyrus.libro;";

			con = ds.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				String titulo = rs.getString(2);
				pw.println(titulo);
			}
			
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
