package Thrades;

public class thradesName {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(() ->{
			for(int i = 0 ; i<= 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
					
				}
			}
		});
		Thread t2 = new Thread(() ->{
			for(int i = 0 ; i<= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
					
				}
			}
		}, "Dipraj_Thread - 1");
		// default thread name of first thread and second thread-> Thread-0, Thread-1
		// you can aslo set the nameof the thread t2.setName("Dipraj_Thread-1")
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		try {
			Thread.sleep(10);
		}
		catch(Exception e) {
			
		}
		t2.start();
		
	}

}
