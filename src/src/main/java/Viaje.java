public class Viaje {
	private String ciudadOrigen;
	private String ciudadDestino;
	private int cantidadPasajero;
	private String horaSalida;
	private String horaLlegada;
	private ArrayList<String> pasajeros;
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

	public Viaje(String ciudadOrigen, String ciudadDestino, int cantidadPasajero, String horaSalida, String horaLlegada) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<String> getPasajeros() {
		throw new UnsupportedOperationException();
	}

	public void setPasajeros(ArrayList<String> pasajeros) {
		throw new UnsupportedOperationException();
	}
}