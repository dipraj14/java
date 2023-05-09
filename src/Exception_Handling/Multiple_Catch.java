package Exception_Handling;

public class Multiple_Catch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr1[] = null;
			arr1[3] = 9;
			int arr[] = new int[8];
			arr[9] = 8;  // call ArrayIndexOutOfBoundsException error
			int i = 9;
			int j = 0;
			int k = i / j;  // As soon as i get the error it jumps into the Catch Block
			System.out.println("Value of the k is : " + k);
		}
		// this block was an error because all Exceptin class Was Subclass of EXCEPTION
//		catch (Excemtion e) {
//			System.out.println("Error");
//		}
		catch(ArithmeticException e) {
			System.out.println("Error");
			System.out.println(e); 
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e); 
		}
		catch(NullPointerException e) {
			System.out.println(e); 
		}
		finally {
			System.out.println("this is finall Block");  // finally block both for try and catch working 
		}
		System.out.println("Hi");

	}
}
