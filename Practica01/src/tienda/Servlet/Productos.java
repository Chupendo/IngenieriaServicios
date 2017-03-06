package tienda.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tienda.DTO.Producto;
import tienda.DTO.Usuario;

/**
 * Clase Servlet para aceptar peticiones y responder al cliente 
 * 
 * @author Pablo Castillo Segura y Andrés Ruiz Peñuela
 *
 */
@WebServlet("/Productos")
public class Productos extends HttpServlet{
	
	//Variable para cambiar la vista
	final String [] web ={"/compra.jsp","/user.jsp"};
	
	/**
	 * Método que atiende peticiones HTTP con método GET, para mostrar los productos
	 *
	 * @param request Petición del cliente
	 * @param response Respuesta del servidor
	 * 
	 * @throws IOException Métodos de lectura y escritura
	 * @throws ServletException Error en el servlet
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{

		//Variable para cambiar la vista
		String url;

		//Método que obtiene la sesión de la petición, y si no existe da error
		HttpSession session = request.getSession(false);
		
		try{
			//Extraemos el objeto usuario de la sessión
			Usuario user = (Usuario) session.getAttribute("usuario");
			
			//Mostramos nombre
			System.out.println(user.getNombre());
			
			
			//Creamos tres productos predefinidos
			//TODO Base de Datos
			
			//Creamos lista de tres productos
			Producto productos[] = new Producto[3];
			
			productos[0] = new Producto(1,"Cruzcampo",1.7,"Cerveza española.","extra/img/cruzcampo.jpg");
			productos[1] = new Producto(2,"Heineken",2,"Cerveza neerlandesa.","extra/img/heineken.jpg");
			productos[2] = new Producto(3,"Coronita",1.85,"Cerveza mexicana.","extra/img/coronita.jpg");
			
			//Creamos arraylist de productos
			ArrayList lista = new ArrayList();
			lista.add(productos[0]);
			lista.add(productos[1]);
			lista.add(productos[2]);
			
			//Enviamos lista al jsp
			request.setAttribute("lista", lista);
			
			//Cambiamos a vista de compra
			url = web[0];

		}catch (Exception e){//Si no se ha creado la sesión correctamente
			
			System.out.println("Sesión no creada, volver a registrar.");
			
			//Cambiamos a vista de registro
			url = web[1];
		}
		
		//Mostramos el jsp de usuario nuevo o la de bienvenido
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}
	
	/**
	 * Método que atiende peticiones HTTP de método POST, para mostrar productos
	 * 
	 * @param request Petición del cliente
	 * @param response Respuesta del servidor
	 * 
	 * @throws IOException Métodos de lectura y escritura
	 * @throws ServletException Error en el servlet
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		doGet(request, response);
	}
}