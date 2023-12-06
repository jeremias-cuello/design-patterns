
public class App {

	public static void main(String[] args) {
		String nombreJuego = "Crash Bandicoot";
		
		Juego juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(1);

		CareTaker caretaker = new CareTaker();
		Originator originator = new Originator();

		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(2);
		originator.setEstado(juego);

		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(3);
		originator.setEstado(juego);

		caretaker.addMemento(originator.guardar()); // ESTADO POSICION 0
		
		// para ver la lista
		caretaker.getMomentos();
		
		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(4);
		originator.setEstado(juego);
		caretaker.addMemento(originator.guardar()); // ESTADO POSICION 1

		caretaker.getMomentos();
		
		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(5);
		originator.setEstado(juego);
		caretaker.addMemento(originator.guardar()); // ESTADO POSICION 2

		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(6);
		originator.setEstado(juego);
    	caretaker.addMemento(originator.guardar()); // ESTADO POSICION 3
		
    	originator.restaurar(caretaker.getMemento(2));
    	caretaker.addMemento(originator.guardar()); // ESTADO POSICION 4
		
    	caretaker.getMomentos();
	}

}
