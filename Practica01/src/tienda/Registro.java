package tienda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Registro")
public class Registro extends HttpServlet{
	//Atenci�n a peticiones Get
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//Variables
		String url=""; //Para ir cambiando las vista.
		System.out.println("Entro en servlet registro.");
		if(request.getParameter("name")==null || request.getParameter("key")==null )
		{//Se a cargado la web por primera vez.
			url="/user.jsp"; //Web de inicio de sesion.
			System.out.println(url);
		}
		else
		{
			url="/bienvenido.jsp";
			//Devuelve la sesion, y si no existe, la crea.
			HttpSession session = request.getSession(true);
			
			// Se leen los par�metros
			String nombre = request.getParameter("name");
			String apellidos = request.getParameter("apellidos");
			String email = request.getParameter("email");
			String key = request.getParameter("key");
			Producto carrito = new Producto();
			ArrayList lista = new ArrayList();//Lista inicial, vac�a.
			// Se crea el objeto usuario
			Usuario usuario = new Usuario (nombre,apellidos,email,key,lista);

			//A continuaci�n guardamos en la sesi�n el objeto usuraio.		
			session.setAttribute ("usuario",usuario);
			
			//Guardamos la fecha de creaci�n de la sesi�n.
			Date date = new Date();
			session.setAttribute("date", date);
			
			//Determinamos la expiraci�n de la sesi�n a 60 minunutos
			session.setMaxInactiveInterval(30*60);
			
			//A�adimos el objeto usuario al jsp.
			request.setAttribute("usuario", usuario);
		}
		//Mostramos el jsp de bienvenida o la de registro.
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}
	
	//Ateni�n a peticiones Post
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
