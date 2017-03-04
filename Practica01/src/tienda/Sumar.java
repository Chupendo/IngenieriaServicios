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

@WebServlet("/Sumar")
public class Sumar extends HttpServlet{
	//Atención a peticiones Get
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//Variables
		String url[]={"/bienvenido.jsp","/user.jsp"}; //Para ir cambiando las vista.
		System.out.println("Añado producto a la sesión.");
		
		//Extraemos la session, si no existe da error.
		HttpSession session = request.getSession(false);
		Usuario usu3 = (Usuario) session.getAttribute("usuario");
		System.out.println("ooOO"+usu3.getNombre());
		try
		{
			//Extraemos el objeto usuario, de la sessión.
			Usuario usu = (Usuario) session.getAttribute("usuario");
			System.out.println(usu.getNombre());
			//Creamos el producto dado que no tenemos la base de datos.
			Producto productos[] = new Producto[3];
			
			productos[0] = new Producto("Cruzcampo","extra/img/cruzcampo.jpg","Elavorada con cebada especial.",1,1.7);
			productos[1] = new Producto("Heinekend","extra/img/heinekend.jpg","Bien fria gusta.",2,2);
			productos[2] = new Producto("Corina","extra/img/coronita.jpg","No veas que rica esta.",3,1.85);
			
			
			//Creamos los productos, dado que no utilizamos base de datos.
			ArrayList producto = new ArrayList();
			if(request.getParameter("opcion")!=null)
			{
				int opcion = Integer.parseInt(request.getParameter("opcion"));
				producto=usu.lista;
				for(int i=0; i<productos.length;i++)
				{
					if(opcion==productos[i].getId())
					{
						producto.add(productos[i]);
					}
				}
				usu.setLista(producto);
			}
			else
			{
				System.out.println("No compro");
			}

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