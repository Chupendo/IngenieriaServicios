package tienda.Servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Clase Servlet para aceptar peticiones y responder al cliente con:
 * -La p�gina inicial para comprobar si el usuario es el administrador (index.jsp)
 * -La p�gina para registrar a un usuario en caso de que no lo sea (user.jsp)
 * -La p�gina para el administrador (admin.jsp)
 * 
 * @author Pablo Castillo Segura y Andr�s Ruiz Pe�uela
 *
 */
@WebServlet("/Web")
public class Web extends HttpServlet {
		
	//Vista que cambia la url
	final String [] web = {"/index.jsp","/user.jsp","/admin.jsp"};
	
	//administrador por defecto
	final String [] admin = {"Andres","Pablo"};
	
	/**
	 * M�todo que atiende peticiones HTTP con m�todo GET.
	 * 
	 * @param request Petici�n del cliente
	 * @param response Respuesta del servidor
	 * 
	 * @throws IOException M�todos de lectura y escritura
	 * @throws ServletException Error en el servlet
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//Variable para ir cambiando las vista
		String url;
		
		//Leemos par�metros del formulario index.jsp
		String id_user = request.getParameter("name");
		String id_key = request.getParameter("key");
		
		//Imprimimos por consola del servidor el usuario y la contrase�a
		System.out.println("name= "+id_user+" key= "+id_key);
		
		//Si los par�metros de nombre y contrase�a son nulos
		if(request.getParameter("name")==null || request.getParameter("key")==null ){
			
			//Recargamos la misma p�gina de inicio (index.jsp)
			url=web[0];
			
		}else{
			//Los datos introducidos coinciden con los del administrador
			if (id_user.equals(admin[0]) && id_key.equals(admin[1])){
				
				//Recargamos la p�gina de administrador (admin.jsp)
				url=web[2];
				Cookie[ ] cookies = request.getCookies( );
				String cookieName ="email";
				String cookieValue = "";
				for (int i=0; i<cookies.length;i++)
				{
					System.out.println("name:"+cookies[i].getName());
					System.out.println("value:"+cookies[i].getValue());
					
				}
				
				//Enviamos el objeto de la clase Usuario al jsp
				request.setAttribute("email", cookieValue);
			}else{//Si los datos introducidos no coinciden con el admin
				
				//Web para que el usuario se registre (user.jsp)
				url=web[1];
			}
		}
		//Respuesta del servlet
		getServletContext().getRequestDispatcher(url).forward(request, response);	

	}
	
	/**
	 * M�todo que atiende peticiones HTTP de m�todo POST
	 * 
	 * @param request Petici�n del cliente
	 * @param response Respuesta del servidor
	 * 
	 * @throws IOException M�todos de lectura y escritura
	 * @throws ServletException Error en el servlet
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}
}
