import java.util.ArrayList;

public class Bus {
	private String patente;
	private String marca;
	private String modelo;
	private Conductor conductor;
	private ArrayList<Viaje> viaje = new ArrayList<Viaje>();

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Bus(String patente, String marca, String modelo) {
		this.patente=patente;
		this.marca=marca;
		this.modelo=modelo;
	}

	public void asociarViaje(Viaje viaje) {
		this.viaje.add(viaje);
		viaje.setBus(this);
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public ArrayList<Viaje> getViaje() {
		return viaje;
	}

	public void setViaje(ArrayList<Viaje> viaje) {
		this.viaje = viaje;
	}

	public String toString() {
		return "";
	}
}