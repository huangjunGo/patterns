package singleton;

public class Singleton2 {
	private static Singleton2 getInstance = new Singleton2();
	
	private Singleton2(){
		
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			Singleton2 i1 = Singleton2.getInstance;
			Singleton2 i2 = Singleton2.getInstance;
			System.out.println(i1 == i2);
		}
	}
}
