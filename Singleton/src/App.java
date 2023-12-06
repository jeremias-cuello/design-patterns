
public class App {

	public static void main(String[] args) {
		Conexion c = Conexion.getInstancia();
		c.Conectar();
		c.Desconectar();
		
		Conexion c2 = Conexion.getInstancia();
		c2.Conectar();
		c2.Desconectar();
		
		// que diferencia hay entre este patron y utilizar una clase estatica?

	}

}
