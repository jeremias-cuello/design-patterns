
public class ConexionVacia implements IConexionBD{
	
	@Override
	public void conectar() {
		System.out.println("No se especifica motor");
	}
	
	@Override
	public void desconectar() {
		System.out.println("No se especifica motor");
	}
}
