package tienda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("TiendaOnline")
public class WebOline extends HttpServlet
{
	//Constantes.
	final String [] web = {"/index.jsp","/user.jsp","/admin.jsp"};
	final String [] admin = {"Andres","Pablo"};
	
	//Atención a peticiones Get
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//Variables
		String url =""; //Para ir cambiando las vista.
		System.out.println("ProbandoooO.");
		//Leemos parametros
		String id_user = request.getParameter("name");
		String id_key = request.getParameter("key");
		System.out.println("ProbandoooO.");
		System.out.println("name= "+id_user+" key= "+id_key);
		if(request.getParameter("name")==null || request.getParameter("key")==null )
		{//Se a cargado la web por primera vez.
			url=web[0];
		}
		else
		{
			if (id_user.equals(admin[0]) && id_key.equals(admin[1]))
			{//Los datos introducidos coincide con el administrado.
				url=web[2];					
			}
			else
			{//Los datos introducidos son del usuario.
				url=web[1]; 
			}
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);	

	}
	
	//Atenión a peticiones Post
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
