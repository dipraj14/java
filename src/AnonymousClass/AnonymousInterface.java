package AnonymousClass;

interface Abc{
	void show();
}
class y implements Abc{
	public void show() {
		System.out.println("anthing");
	}
}

public class AnonymousInterface {
	public static void main(String[] args) { 
		Abc obj = new y();
		// Anonymous class which implements Abc and override show method
		Abc s = new Abc() {
			public void show() {
				System.out.println("Hi i am Annon");
			}
		};
		obj.show();
		s.show();
		
	}
}
