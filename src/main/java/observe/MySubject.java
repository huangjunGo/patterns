package observe;

public class MySubject extends AbstractSubject{

	public void operation() {
		System.out.println("mysubjcet update");
		notifyObservers();
	}

}
