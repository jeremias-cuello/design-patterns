
public class ConexionPostgreeSQL implements IConexionBD{
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionPostgreeSQL() {
		this.host = "localhost";
		this.puerto = "3003";
		this.usuario = "admin";
		this.contrasena = "123456789";
	}
	
	@Override
	public void conectar() {
		System.out.println("Contando a PostgreeSql");
	}
	
	@Override
	public void desconectar() {
		System.out.println("Descontando a PostgreeSql");
	}
}
