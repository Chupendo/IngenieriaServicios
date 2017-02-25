package tienda;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Web")
public class Web extends HttpServlet {
	//Constantes.
		final String [] web = {"/index.jsp","/user.jsp","/admin.jsp"};
		final String [] admin = {"Andres","Pablo"};
		
		//Atención a peticiones Get
		protected void doGet(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException 
		{
			//Variables
			String url; //Para ir cambiando las vista.
			System.out.println("ProbandoooO.");
			//Leemos parametros
			String id_user = request.getParameter("name");
			String id_key = request.getParameter("key");
			System.out.println("name= "+id_user+" key= "+id_key);
			
			if(request.getParameter("name")==null || request.getParameter("key")==null )
			{//Se a cargado la web por primera vez.
				url=web[0]; //Web de inicio de sesion.
				System.out.println(url);
			}
			else
			{
				if (id_user.equals(admin[0]) && id_key.equals(admin[1]))
				{//Los datos introducidos coincide con el administrado.
					url=web[2]; //Web para la identificación.
					System.out.println(url);
				}
				else
				{//Los datos introducidos son del usuario.
					url=web[1]; //Web para que el usuario se registre.
					System.out.println(url);
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
