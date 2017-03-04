package tienda;
import java.util.ArrayList;

public class Usuario {
	//Atributos.
	private String nombre;
	String apellidos;
	String email;
	String clave;
	ArrayList lista = new ArrayList();

	
	//Constuctores
	public Usuario ()
	{//Constructor por defecto.
		this.nombre="";
		this.apellidos="";
		this.email="";
		this.clave="";
		this.lista.add("");
	}
	public Usuario (String nombre,String apellidos,String email, String clave, ArrayList lista)
	{//Constructor con parametros.
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.email=email;
		this.clave=clave;
		this.lista=lista;
	}
	//Metodos de acceso.
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public ArrayList getLista() {
		return lista;
	}
	public void setLista(ArrayList lista) {
		this.lista = lista;
	}
	
	
	
}
