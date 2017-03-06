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

	/**
	 * M�todo que atiende peticiones HTTP con m�todo GET, para registro de usuario
	 * 
	 * @param request Petici�n del cliente
	 * @param response Respuesta del servidor
	 * 
	 * @throws IOException M�todos de lectura y escritura
	 * @throws ServletException Error en el servlet
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		//Constantes.
		final String [] web = {"/user.jsp","/bienvenido.jsp"};
		
		//Varia
		String url;

		//Si los par�metros de nombre y contrase�a son nulos
		//TODO cambiar try y catch cuando se haya implementado la base de datos
		if(request.getParameter("name")==null|| request.getParameter("key")==null){
			
			//Volvemos a cargar la p�gina de usuario (user.jsp)
			url = web[0];
			
		}else{//Si no hay fallo al introducir un nuevo usuario
			
			//Devolvemos la p�gina de bienvenido
			url=web[1];
			
			//M�todo que obtiene la sesi�n de la petici�n, y si no existe, la crea
			HttpSession session = request.getSession(true);
			
			// Se leen los par�metros de la petici�n
			String nombre = request.getParameter("name");
			String apellidos = request.getParameter("apellidos");
			String email = request.getParameter("email");
			String key = request.getParameter("key");
			
			//Se crea lista de Productos
			ArrayList lista = new ArrayList();
			
			//Se crea el objeto de la clase Usuario con las variables
			Usuario usuario = new Usuario (nombre, apellidos, email, key, lista);

			//Guardamos en la sesi�n el objeto usuario	
			session.setAttribute ("usuario",usuario);
			
			//Guardamos en la sesion la fecha de creaci�n
			Date date = new Date();
			session.setAttribute("date", date);
			
			//Determinamos la expiraci�n de la sesi�n a 60 minutos
			session.setMaxInactiveInterval(30*60);
			
			//Enviamos el objeto de la clase Usuario al jsp
			request.setAttribute("usuario", usuario);
		}
		//Mostramos el jsp de usuario nuevo o la de bienvenido
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}
	
	
	/**
	 * M�todo que atiende peticiones HTTP de m�todo POST, para registro de usuario
	 * 
	 * @param request Petici�n del cliente
	 * @param response Respuesta del servidor
	 * 
	 * @throws IOException M�todos de lectura y escritura
	 * @throws ServletException Error en el servlet
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
