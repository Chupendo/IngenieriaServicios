package tienda;

public class Producto {
	private String imagen;
	private int id;
	private String concepto;
	private double importe;
	private String nombre;
	
	//Constuctores
	public Producto ()
	{//Constructor por defecto.
		this.imagen="";
		this.id=0;
		this.concepto="";
		this.importe=0.0;
		this.nombre="";
	}
	public Producto (String nombre,String imagen, String concepto,int id,double importe)
	{//Constructor con parametros.
		this.imagen=imagen;
		this.id=id;
		this.concepto=concepto;
		this.importe=importe;
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//Metodos de acceso.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
}
