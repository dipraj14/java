package Exception_Handling;

public class Exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 9;
			int j = 0;
			int k = i / j;  // As soon as i get the error it jumps into the Catch Block
			System.out.println("Value of the k is : " + k);
		}
		catch(ArithmeticException e) {
			System.out.println("Error");
			System.out.println(e); 
		}
	
		finally {
			System.out.println("this is finall Block");  // finally block both for try and catch working 
		}
		System.out.println("Hi");

	}

}
