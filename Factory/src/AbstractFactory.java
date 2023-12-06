
public abstract class AbstractFactory {
	public abstract IConexionREST getREST(String area);
	public abstract IConexionBD getConexionBD(String motor);
}
