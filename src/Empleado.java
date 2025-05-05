
public class Empleado {

	private String nombre;
	private double sueldo;
	private Departamento departamento;
	private int horas;
	public Empleado(String nombre, double sueldo, Departamento departamento, int horas) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.departamento = departamento;
		this.horas = horas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", departamento=" + departamento + ", horas="
				+ horas + "]";
	}
	
}
