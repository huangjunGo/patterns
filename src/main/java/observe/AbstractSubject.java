package observe;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject{

	private Vector<Observer> vector = new Vector<Observer>();
	
	public void add(Observer o) {
		vector.add(o);
	}

	public void del(Observer o) {
		vector.remove(o);
	}

	public void notifyObservers() {
		Enumeration<Observer> elements = vector.elements();
		while (elements.hasMoreElements()) {
			Observer observer = elements.nextElement();
			observer.update();
		}
	}


}
