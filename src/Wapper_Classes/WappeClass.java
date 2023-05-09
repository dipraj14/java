package Wapper_Classes;

public class WappeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 9; // primitive Type
		Integer ii = new Integer(i); // Wapper  classes (Boxing or Wrapping)
		
		int j = ii.intValue(); // unboxing or UnWrapping 
		
		Integer value = i; // autoWrapping 
		
		int k = value; // auto UnWrapping 
		
		System.out.println(value.intValue()+" " + k);
		
		String s = "123";
		int k = Integer.parseInt(s) ; // string to interger 
	}

}
