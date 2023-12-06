
import java.util.ArrayList;

public class CareTaker {
	private ArrayList<Memento> momentos = new ArrayList<Memento>();
	
	public void addMemento(Memento m) {
		momentos.add(m);
	}
	
	public Memento getMemento(int index) {
		return momentos.get(index);
	}
	
	public void getMomentos() {
		System.out.println("Lista:");
		momentos.forEach(m -> System.out.println(m.getEstado()));
	}
}
