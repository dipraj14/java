package Thrades;
class counter{
	int count;
	public synchronized void increment() { // // if you not used synchronized at will falls in the situation when two thread access the value of the thread same time
								//  it should be 2000 but gives any value 1 to 2000 
		count++;
	}
}
public class Thread_Synchronized {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		counter c1 = new counter();
		Thread o1 = new Thread(() -> {
			for(int i = 1; i<=1000; i++) {
				c1.increment();
			}
		});
		Thread o2 = new Thread(() -> {
			for(int i = 1; i<=1000; i++) {
				c1.increment();
			}
		});
		
		
		
		o1.start();
		o2.start();
		o1.join(); // pls wait the main thread other wise main thread the value of the counter
		o2.join();
		System.out.println("Value of the count is: "+ c1.count); // it should be 2000 but gives any value 1 to 2000 

	}

}
