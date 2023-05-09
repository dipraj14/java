package Exception_Handling;

public class multiple_catch_block_in_one_catch {

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

		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("Error");
			System.out.println(e); 
		}
		
		finally {
			System.out.println("this is finall Block");  // finally block both for try and catch working 
		}

	}

}
