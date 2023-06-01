import java.util.ArrayList;

public class Empresa {
	private String rut;
	private String direccion;
	private String redesSociales;
	private ArrayList<Bus> buses = new ArrayList<Bus>();
	private ArrayList<Viaje> viajes = new ArrayList<Viaje>();
	private ArrayList<Conductor> conductores = new ArrayList<>();

	public String getRut() {
		return this.rut;
	}

	public void setRut(){this.rut=rut;}

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
		this.rut=rut;
		this.direccion=direccion;
		this.redesSociales=redesSociales;
	}

	public void agregarBus(String patente, String marca, String modelo) {
		Bus bus= new Bus(patente, marca, modelo);
		buses.add(bus);
	}

	public void agregarConductor(String nombre, String apellido, int numeroContacto,Conductor.Tipo tipoLicencia) {
		Conductor conductor=new Conductor(nombre,apellido,numeroContacto,tipoLicencia);
		conductores.add(conductor);
	}

	public void descontinuarBus(String patente) {
		buses.remove(patente);
	}

	public int cantidadBuses() {
		System.out.println("Esta empresa tiene "+buses.size()+" buses");
		return buses.size();
	}

	public int ViajesACiudad(String CiudadDestino) {
		int viajesCiudad=0;
		for (int i = 0; i < viajes.size(); i++) {
			if (viajes.get(i).getCiudadDestino()==CiudadDestino){
				viajesCiudad++;
			}
		}
		return viajesCiudad;
	}
	public void asociarConductorABus(String patente,Conductor conductor, String nombre) {
		for (int i = 0; i < buses.size(); i++) {
			for (int j = 0; j < conductores.size(); j++) {
				if(buses.get(i).getPatente().equals(patente)&&conductores.get(j).getNombre()==nombre){
					buses.get(i).setConductor(conductor);
					conductores.get(j).setBus(buses.get(i));
				}
			}
		}
	}

	public ArrayList<Bus> getBuses() {
		return buses;
	}

	public ArrayList<Conductor> getConductores() {
		return conductores;
	}

	public ArrayList<Viaje> getViaje() {
		return viajes;
	}

	public void setConductores(ArrayList<Conductor> conductores) {
		this.conductores = conductores;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public void setBuses(ArrayList<Bus> buses) {
		this.buses = buses;
	}

	public void setViaje(ArrayList<Viaje> viaje) {
		this.viajes = viaje;
	}
	public String toString() {
		return "";
	}
}