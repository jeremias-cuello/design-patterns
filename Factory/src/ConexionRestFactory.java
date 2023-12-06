
public class ConexionRestFactory extends AbstractFactory {
	@Override
	public IConexionREST getREST(String area) {
		switch(area) {
			case "Compras": return new ConexionRESTCompras();
			case "Ventas": return new ConexionRESTVentas();
			default: return new ConexionRESTNoArea();
		}
	}

	@Override
	public IConexionBD getConexionBD(String motor) {
		return null;
	}
}
