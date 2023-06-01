import java.util.ArrayList;

public class Empresa {
	private String rut;
	private String direccion;
	private String redesSociales;
	private ArrayList<Bus> buses = new ArrayList<Bus>();
	private ArrayList<Viaje> viaje = new ArrayList<Viaje>();

	public String getRut() {
		return this.rut;
	}

	public String setRut(int rut) {
		throw new UnsupportedOperationException();
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRedesSociales() {
		return this.redesSociales;
	}

	public void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}

	public Empresa(String rut, String direccion, String redesSociales) {
		throw new UnsupportedOperationException();
	}

	public void agregarBus(String patente, String marca, String modelo) {
		throw new UnsupportedOperationException();
	}

	public void agregarConductor(String nombre, String apellido, int numeroContacto,Tipo tipoLicencia) {
		throw new UnsupportedOperationException();
	}

	public void descontinuarBus(String patente) {
		throw new UnsupportedOperationException();
	}

	public int cantidadBuses() {
		throw new UnsupportedOperationException();
	}

	public int ViajesACiudad() {
		throw new UnsupportedOperationException();
	}
}