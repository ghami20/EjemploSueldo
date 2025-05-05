
public class Departamento {
	private String nombre;
	private Empresa empresa;
	private int bono;
	private String sector;
	public Departamento(String nombre, int bono, String sector,Empresa empresa) {
		this.empresa = empresa;
		this.nombre = nombre;
		this.bono = bono;
		this.sector = sector;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getBono() {
		return bono;
	}
	public void setBono(int bono) {
		this.bono = bono;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", empresa=" + empresa + ", bono=" + bono + ", sector=" + sector
				+ "]";
	}
	
}
