
public class App {

	public static void main(String[] args) {
		AbstractFactory factory1 = FactoryProducer.getFactory("BD");
		IConexionBD cx1 = factory1.getConexionBD("MySQL");
		cx1.conectar();
		cx1.desconectar();
		
		IConexionBD cx2 = factory1.getConexionBD("PostgreeSQL");
		cx2.conectar();
		cx2.desconectar();
		
		IConexionBD cx3 = factory1.getConexionBD("Oracle");
		cx3.conectar();
		cx3.desconectar();
		
		IConexionBD cx4 = factory1.getConexionBD("equivocacion");
		cx4.conectar();
		cx4.desconectar();
		
		AbstractFactory factory2 = FactoryProducer.getFactory("REST");
		IConexionREST rx1 = factory2.getREST("Compras");
		rx1.leerURL("https://gthub.com/jeremias-cuello");
		
		IConexionREST rx2 = factory2.getREST("sin-especificar");
		rx2.leerURL("https://gthub.com/jeremias-cuello/TATETI");
		
		IConexionREST rx3 = factory2.getREST("Ventas");
		rx3.leerURL("https://youtube.com");
		
		IConexionREST rx4 = factory2.getREST("Compras");
		rx4.leerURL("https://facebook.com");		
	}

}
