package tienda.DTO;
import java.util.ArrayList;

/**
 * Objeto de la clase Usuario, que incluye todos los atributos de cada persona
 * 
 * @author Pablo Castillo Segura y Andrés Ruiz Peñuela
 *
 */
public class Usuario {
	private String nombre;
	String clave;
	String apellidos;
	String email;

	//Constuctor por defecto
	public Usuario (){
		this.nombre="";
		this.clave="";
		this.apellidos="";
		this.email="";
	}
	
	//Constructor
	public Usuario (String nombre,String clave,String apellidos,String email){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.email=email;
		this.clave=clave;
	}
	
	//Metodos get
	public String getNombre() {
		return nombre;
	}
	public String getClave() {
		return clave;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getEmail() {
		return email;
	}
	
	//Métodos set
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
