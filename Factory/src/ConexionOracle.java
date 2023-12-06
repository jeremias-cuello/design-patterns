

public class ConexionOracle implements IConexionBD{
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionOracle() {
		this.host = "localhost";
		this.puerto = "3001";
		this.usuario = "admin";
		this.contrasena = "123456";
	}
	
	@Override
	public void conectar() {
		System.out.println("Contando a Oracle");
	}
	
	@Override
	public void desconectar() {
		System.out.println("Descontando a Oracle");
	}
}