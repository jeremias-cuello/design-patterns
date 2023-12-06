
public class ConexionMySQL implements IConexionBD{
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionMySQL() {
		this.host = "localhost";
		this.puerto = "3000";
		this.usuario = "admin";
		this.contrasena = "123";
	}
	
	@Override
	public void conectar() {
		System.out.println("Contando a MySQL");
	}
	
	@Override
	public void desconectar() {
		System.out.println("Descontando a MySQL");
	}
}
