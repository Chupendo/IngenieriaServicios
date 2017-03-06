package tienda.DTO;

/**
 * Objeto de la clase Producto, que incluye todas las caracter�sticas de cada item
 * 
 * @author Pablo Castillo Segura y Andr�s Ruiz Pe�uela
 *
 */
public class Producto {
	private int id;
	private String nombre;
	private double importe;
	private String concepto;
	private String imagen;
	
	//Constuctor por defecto
	public Producto (){
		this.id=0;
		this.nombre="";
		this.importe=0.0;
		this.concepto="";
		this.imagen="";
	}
	
	//Constructor
	public Producto (int id, String nombre,double importe,String concepto,String imagen){
		this.id=id;
		this.nombre=nombre;
		this.imagen=imagen;
		this.concepto=concepto;
		this.importe=importe;
		
	}
	
	//M�todos get
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public double getImporte() {
		return importe;
	}
	public String getConcepto() {
		return concepto;
	}
	public String getImagen() {
		return imagen;
	}
	
	//M�todos set
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
}
