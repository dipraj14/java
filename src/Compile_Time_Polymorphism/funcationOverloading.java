
/*
 * In Java polymorphism is mainly divided into two types: 
 * i) Compile-time Polymorphism
 * ii) Runtime Polymorphism
 * 
 * i) Type 1: Compile-time polymorphism
 * 
 * It is also known as static polymorphism. 
 * This type of polymorphism is achieved by function overloading 
 * or operator overloading. 
 */

// Funcation Overloading 
package Compile_Time_Polymorphism;

class Helper {
	 
    // Method with 2 integer parameters
    static int Multiply(int a, int b)
    {
 
        // Returns product of integer numbers
        return a * b;
    }
 
    // Method 2
    // With same name but with 2 double parameters
    static double Multiply(double a, double b)
    {
 
        // Returns product of double numbers
        return a * b;
    }
}
public class funcationOverloading {
	 public static void main(String[] args)
	    {
	 
	        // Calling method by passing
	        // input as in arguments
	        System.out.println(Helper.Multiply(2, 4));
	        System.out.println(Helper.Multiply(5.5, 6.3));
	    }
}
