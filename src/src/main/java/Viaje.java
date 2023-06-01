import java.util.ArrayList;

public class Viaje {
	private String ciudadOrigen;
	private String ciudadDestino;
	private int cantidadPasajero;
	private String horaSalida;
	private String horaLlegada;
	private ArrayList<String> pasajeros= new ArrayList<>();
	private Bus bus;

	public String getCiudadOrigen() {
		return this.ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getCiudadDestino() {
		return this.ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public int getCantidadPasajero() {
		return this.cantidadPasajero;
	}

	public void setCantidadPasajero(int cantidadPasajero) {
		this.cantidadPasajero = cantidadPasajero;
	}

	public String getHoraSalida() {
		return this.horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getHoraLlegada() {
		return this.horaLlegada;
	}

	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public Viaje(String ciudadOrigen, String ciudadDestino, String horaSalida, String horaLlegada) {
		this.ciudadOrigen=ciudadOrigen;
		this.ciudadDestino=ciudadDestino;
		this.horaLlegada=horaLlegada;
		this.horaSalida=horaSalida;
	}

	public ArrayList<String> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(ArrayList<String> pasajeros) {
		this.pasajeros=pasajeros;
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