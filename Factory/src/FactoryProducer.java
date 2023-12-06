
public class FactoryProducer {
	public static AbstractFactory getFactory(String factory) {
		switch(factory) {
			case "BD": return new ConexionFactoryBD();
			case "REST": return new ConexionRestFactory();
			default: return null;
		}
	}
}
