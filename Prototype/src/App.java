
public class App {

	public static void main(String[] args) {
		CuentaAH c = new CuentaAH(1200);
		System.out.println(c.toString());
		c.setSaldo(500);
		System.out.println(c.toString());
		
		CuentaAH cuentaClonada = (CuentaAH) c.clonar();
		System.out.println(cuentaClonada.toString());
		c.setSaldo(3000);
		// cuentaClonada.setSaldo(5000);
		System.out.println(c.toString());
		System.out.println(cuentaClonada.toString());
		
		// Tener en cuenta que clone() de Cloneable solo hace un copia superficial de los objetos
		// no copiará objetos anidados, en ese caso se debe hacer una copia profunda
	}

}
