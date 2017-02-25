package tienda;

public class Usuario {
	//Atributos.
	String nombre;
	String apellidos;
	String email;
	String clave;
	
	//Constuctores
	public Usuario ()
	{//Constructor por defecto.
		this.nombre="";
		this.apellidos="";
		this.email="";
		this.clave="";
	}
	public Usuario (String nombre,String apellidos,String email, String clave)
	{//Constructor con parametros.
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.email=email;
		this.clave=clave;
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
	
	
	
}
