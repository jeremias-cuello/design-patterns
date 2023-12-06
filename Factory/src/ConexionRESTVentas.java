
public class ConexionRESTVentas implements IConexionREST {
	@Override
	public void leerURL(String url) {
		System.out.println("Desde Ventas. Conectandose a " + url);		
	}
}
