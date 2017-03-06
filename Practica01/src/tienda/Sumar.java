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

import tienda.DTO.Producto;
import tienda.DTO.Usuario;

@WebServlet("/Sumar")
public class Sumar extends HttpServlet{
	//Atenci�n a peticiones Get
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//Variables
		String url[]={"/bienvenido.jsp","/user.jsp"}; //Para ir cambiando las vista.
		System.out.println("A�ado producto a la sesi�n.");
		
		//Extraemos la session, si no existe da error.
		HttpSession session = request.getSession(false);
		Usuario usu3 = (Usuario) session.getAttribute("usuario");
		System.out.println("ooOO"+usu3.getNombre());
		try
		{
			//Extraemos el objeto usuario, de la sessi�n.
			Usuario usu = (Usuario) session.getAttribute("usuario");
			System.out.println(usu.getNombre());
			//Creamos el producto dado que no tenemos la base de datos.
			Producto productos[] = new Producto[3];
			
			productos[0] = new Producto(1,"Cruzcampo",1.7,"Cerveza espa�ola.","extra/img/cruzcampo.jpg");
			productos[1] = new Producto(2,"Heineken",2,"Cerveza neerlandesa.","extra/img/heineken.jpg");
			productos[2] = new Producto(3,"Corina",1.85,"Cerveza mexicana.","extra/img/coronita.jpg");
			
			
			//Creamos los productos, dado que no utilizamos base de datos.
			ArrayList producto = new ArrayList();
			if(request.getParameter("opcion")!=null)
			{
				int opcion = Integer.parseInt(request.getParameter("opcion"));
				//TODO producto=usu.lista;
				for(int i=0; i<productos.length;i++)
				{
					if(opcion==productos[i].getId())
					{
						producto.add(productos[i]);
					}
				}
				//TODO usu.setLista(producto);
			}
			else
			{
				System.out.println("No compro");
			}

			getServletContext().getRequestDispatcher(url[0]).forward(request, response);
		}
		catch (Exception e)
		{//En caso de no se haya creado la sessi�n correctamente.
			System.out.println("Sesion no creada, volver a registrar.");
			getServletContext().getRequestDispatcher(url[1]).forward(request, response);
		}
		

		
	}
	
	//Ateni�n a peticiones Post
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		doGet(request, response);
	}
}