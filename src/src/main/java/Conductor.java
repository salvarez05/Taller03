public class Conductor {
	private String nombre;
	private String apellido;
	private int numeroContacto;
	private Tipo tipoLicencia;
	public enum Tipo{A1,A2,A3,A4,A5}
	private Bus bus;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumeroContacto() {
		return this.numeroContacto;
	}

	public void setNumeroContacto(int numeroContacto) {
		this.numeroContacto = numeroContacto;
	}

	public Tipo getTipoLicencia() {
		return this.tipoLicencia;
	}

	public void setTipoLicencia(Tipo tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}

	public Conductor(String nombre, String apellido, int numeroContacto, Tipo tipoLicencia) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.numeroContacto=numeroContacto;
		this.tipoLicencia=tipoLicencia;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public Bus getBus() {
		return bus;
	}

	public String toString() {
		return "";
	}
}