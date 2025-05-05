
public class Empresa {

	private String nombre;
	private String direccion;
	private int cuit;
	public Empresa(String nombre, String direccion, int cuit) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.cuit = cuit;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", direccion=" + direccion + ", cuit=" + cuit + "]";
	}
	
	
	
}
