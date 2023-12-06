
public class Juego {
	private String nombre;
	private int chePoint;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCheckPoint() {
		return chePoint;
	}
	public void setCheckpoint(int chePoint) {
		this.chePoint = chePoint;
	}
	
	@Override
	public String toString() {
		return "Juego { Nombre: " + nombre + " - Chekpoint: " + chePoint + "}";
	}
}
