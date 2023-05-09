package Thrades;
class A1 implements Runnable{
	public void run() {
		for(int i = 1; i<= 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
}
class B1 implements Runnable{
	public void run() {
		for(int i =1; i<= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
}
public class RunableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj1 = new A1();  // you also write [ Runnable obj1 = new A1() ] 
		B1 obj2 = new B1();
		Thread o1 = new Thread(obj1);
		Thread o2 = new Thread(obj2);
		
		
		o1.start();
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {
			
		}
		o2.start();
		

	}

}
