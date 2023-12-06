
public class ConexionFactoryBD extends AbstractFactory{
	@Override
	public IConexionBD getConexionBD(String motor) {
		switch(motor) {
			case "MySQL": return new ConexionMySQL();
			case "Oracle": return new ConexionOracle();
			case "PostgreeSQL": return new ConexionPostgreeSQL();
			default: return new ConexionVacia();
		}
	}

	@Override
	public IConexionREST getREST(String area) {
		return null;
	}
}