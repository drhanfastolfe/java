package libros;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/ControladorLibros")
public class ControladorLibros extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	private ModeloLibros modeloLibros;
	
	@Resource(name="jdbc/papyrus-simple")
	private DataSource ds;
	
	
	
	@Override
	public void init() throws ServletException
	{
		// TODO Auto-generated method stub
		super.init();
		
		try
		{
			modeloLibros = new ModeloLibros(ds);
		}
		catch(Exception e)
		{
			throw new ServletException(e);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		List<Libro> libros;
		
		try
		{
			libros = modeloLibros.getLibros();
			
			request.setAttribute("LISTALIBROS", libros);
			
			RequestDispatcher rDisp = request.getRequestDispatcher("/ListaLibros.jsp");
			
			rDisp.forward(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
