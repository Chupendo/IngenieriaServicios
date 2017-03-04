package tienda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Productos")
public class Productos extends HttpServlet{
	//Atención a peticiones Get
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//Variables
		String url[]={"/compra.jsp","/user.jsp"}; //Para ir cambiando las vista.
		System.out.println("Entro en la lista de productos..");

		//Extraemos la session, si no existe da error.
		HttpSession session = request.getSession(false);
		try
		{
			//Extraemos el objeto usuario, de la sessión.
			Usuario usu = (Usuario) session.getAttribute("usuario");
			System.out.println(usu.getNombre());
			//Creamos los productos, dado que no utilizamos base de datos.
			//Creamos el producto dado que no tenemos la base de datos.
			
			Producto productos[] = new Producto[3];
			
			productos[0] = new Producto("Cruzcampo","extra/img/cruzcampo.jpg","Elavorada con cebada especial.",1,1.7);
			productos[1] = new Producto("Heinekend","extra/img/heinekend.jpg","Bien fria gusta.",2,2);
			productos[2] = new Producto("Corina","extra/img/coronita.jpg","No veas que rica esta.",3,1.85);
			
			//Creamos una lista de productos.
			ArrayList lista = new ArrayList();
			lista.add(productos[0]);
			lista.add(productos[1]);
			lista.add(productos[2]);
			//La enviamos al jsp.
			request.setAttribute("lista", lista);
			System.out.println("aqui?"+usu.getNombre());
			getServletContext().getRequestDispatcher(url[0]).forward(request, response);

		}
		catch (Exception e)
		{//En caso de no se haya creado la sessión correctamente.
			System.out.println("Sesion no creada, volver a registrar.");
			getServletContext().getRequestDispatcher(url[1]).forward(request, response);
		}
		

		
	}
	
	//Atenión a peticiones Post
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		doGet(request, response);
	}
}