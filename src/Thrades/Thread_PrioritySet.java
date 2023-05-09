package Thrades;

public class Thread_PrioritySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread o1 = new Thread(() -> {
			for(int i = 1; i<= 5; i++) {
				System.out.println("Hi " + Thread.currentThread().getPriority());
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
					
				}
			}
		});
		
		Thread o2 = new Thread(() -> {
			for(int i =1; i<= 5; i++) {
				System.out.println("Hello " + Thread.currentThread().getPriority());
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
					
				}
			}
		});
		
		// Default priority of the thread was 5. you an set the priority of the thread 
		// 1 to 10 ... 1 means least priority and 10 means highest priority
		System.out.println(o1.getPriority()); // default priority was 5
		System.out.println(o2.getPriority());
		
		o1.setPriority(2); // set the priority 
		o2.setPriority(6);
		System.out.println(o1.getPriority());
		System.out.println(o2.getPriority());
		
		// You can also set the thread priority like this because it was hard to remember 
		// numeric value
		o1.setPriority(Thread.MIN_PRIORITY);  // MIN_PRIORITY -> 1
		o2.setPriority(Thread.MAX_PRIORITY);  // MAX_PRIORITY -> 10
		// NORM_PRIORITY -> 5
		System.out.println(o1.getPriority());
		System.out.println(o2.getPriority());
		
		o1.start();
		try {
			Thread.sleep(10);
		}
		catch(Exception e) {
			
		}
		o2.start();

	}

}
