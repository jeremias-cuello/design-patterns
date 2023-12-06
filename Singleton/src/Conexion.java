
public class Conexion {
	private static Conexion instancia;
	
	private Conexion() { }
	
	public static Conexion getInstancia() {
		if(instancia == null) {
			instancia = new Conexion();
		} 
		
		return instancia;
	}

	public void Conectar() {
		System.out.println("Me conecté a la base de datos.");
	}
	
	public void Desconectar() {
		System.out.println("Me desconecté a la base de datos.");
	}
}
