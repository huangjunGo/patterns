package adapter;

public class Wrapper implements Targetable{
	
	private Source source;
	
	public Wrapper(Source source){
		super();
		this.source = source;
	}

	public void method1() {
		source.method1();
	}

	public void method2() {
		System.err.println("");
	}

}
