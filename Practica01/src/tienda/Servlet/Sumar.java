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
* Clase Servlet para aceptar peticiones y responder al cliente con:
* -La página del carrito con los productos que lleva (bienvenido.jsp)
* -La página para registrar a un usuario (user.jsp)
* 
* @author Pablo Castillo Segura y Andrés Ruiz Peñuela
*
*/
@WebServlet("/Sumar")
public class Sumar extends HttpServlet{

	//Variable para cambiar la vista
	final String [] web ={"/bienvenido.jsp","/user.jsp"};
		
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
		
		ArrayList<Producto> lista = new ArrayList<>();
		
		String url;
		
		//Método que obtiene la sesión de la petición, y si no existe da error
		HttpSession session = request.getSession(false);
		
		try{
			//Extraemos la lista de objetos de la sesión
			lista = (ArrayList) session.getAttribute("lista");
			
			
			//Creamos tres productos predefinidos
			//TODO Base de Datos
			
			
			//Creamos lista de tres productos
			Producto productos[] = new Producto[3];
			
			productos[0] = new Producto(1,"Cruzcampo",1.7,"Cerveza española.","extra/img/cruzcampo.jpg");
			productos[1] = new Producto(2,"Heineken",2,"Cerveza neerlandesa.","extra/img/heineken.jpg");
			productos[2] = new Producto(3,"Corina",1.85,"Cerveza mexicana.","extra/img/coronita.jpg");
			
			
			//Si opción (de compra.jsp) es distinto de null
			if(request.getParameter("opcion")!=null){
				
				//Recogemos opción
				int opcion = Integer.parseInt(request.getParameter("opcion"));
				
				for(int i=0; i<productos.length;i++){
					if(opcion==productos[i].getId()){
						lista.add(productos[i]);
					}
				}
				
			}else{ //Si no elige ningún producto
				System.out.println("No compra");
			}

			//Guardamos en la sesión, de nuevo, la lista	
			session.setAttribute ("lista",lista);
			
			//Muestro vista de carrito
			url = web[0];
			
			getServletContext().getRequestDispatcher(url).forward(request, response);
			
		}catch (Exception e){//Si no se ha creado la sessión correctamente
			//Vista de registro
			url = web[1];
			
			System.out.println("Sesion no creada, volver a registrar.");
			getServletContext().getRequestDispatcher(url).forward(request, response);
		}
		
	}
	
	/**
	 * Método que atiende peticiones HTTP de método POST, para registro de usuario
	 * 
	 * @param request Petición del cliente
	 * @param response Respuesta del servidor
	 * 
	 * @throws IOException Métodos de lectura y escritura
	 * @throws ServletException Error en el servlet
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		doGet(request, response);
	}
}