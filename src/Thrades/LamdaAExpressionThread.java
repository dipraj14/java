package Thrades;
/* why you need to write or implement this two class. you assume this two classes as interface
 
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
*/
public class LamdaAExpressionThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create Annoymous Class 
//		A1 obj1 = new A1();  // you also write [ Runnable obj1 = new A1() ] 
//		B1 obj2 = new B1();
		Runnable obj1 = new Runnable(){ 
			public void run(){
				for(int i = 1; i<= 5; i++) {
					System.out.println("Hi");
					try {
						Thread.sleep(500);
					}
					catch(Exception e) {
						
					}
				}
			}
		};
		/* you can write with out class name because runnable was a funcational 
		 * interface and it has run() was an abstract method 
				 Runnable obj1 = () -> 
				{
					for(int i = 1; i<= 5; i++) {
						System.out.println("Hi");
						try {
							Thread.sleep(500);
						}
						catch(Exception e) {
							
						}
					}
				}
			;
		 */
		// if you copy this code while pass into the thread , don't required for making obj2
		Runnable obj2 = () -> {
				for(int i =1; i<= 5; i++) {
					System.out.println("Hello");
					try {
						Thread.sleep(500);
					}
					catch(Exception e) {
						
					}
				}
			}
		;
		
		Thread o1 = new Thread(obj1);
		// you can copy upper code instade of obj2 
		Thread o2 = new Thread(() -> {
			for(int i =1; i<= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
					
				}
			}
		});
		
		
		o1.start();
		try {
			Thread.sleep(10);
		}
		catch(Exception e) {
			
		}
		o2.start();
		

	}
}
