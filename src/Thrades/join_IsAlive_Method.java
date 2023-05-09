package Thrades;

public class join_IsAlive_Method {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread o1 = new Thread(() -> {
			for(int i = 1; i<= 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
					
				}
			}
		});
		
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
		
		// join funcation do main() thread wait // note it throws exception
		
		// isalive() is a method where you check thread was runnable or not
		System.out.println(o1.isAlive()); // in there thread was runnable
		o1.join();
		o2.join();
		
		System.out.println(o1.isAlive()); // in there thread excute was over because join() funcation called
	
		System.out.println("Bye");
		


	}

}
