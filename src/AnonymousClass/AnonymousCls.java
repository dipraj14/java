package AnonymousClass;

class A{
	void show(){
		System.out.println("in a");
	}
}
class B extends A{
	void show() {
		System.out.println("I am good");
	}
}
public class AnonymousCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();  // it created object of b 
		// if i not wat to make B class and make a anonyomus class object and override the show() method
		
		// Anonyomus class 
		A obj = new A() {
			void show(){
				System.out.println("This is Anonyomus class");
			}
		};
		
		a.show();
		obj.show();
	}

}
