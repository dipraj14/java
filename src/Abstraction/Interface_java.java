package Abstraction;
/*
 *  Interfaces

	- All the fields in interfaces are public, static and final by default.
	- All methods are public & abstract by default.	
	- A class that implements an interface must implement all the methods declared in the interface.
	- Interfaces support the functionality of multiple inheritance.

 */
interface Animal1{
	void walk();
	
}
class Horse1 implements Animal1{
	public void walk() {
		System.out.println("horse Walk on 4 legs");
	}
}
class Chicken1 implements Animal1 {
	   public void walk() {
	       System.out.println("Chicken walks on 2 legs");
	   }
}
public class Interface_java {

	public static void main(String[] args) {
		Horse1 h1 = new Horse1();
		h1.walk();

	}

}
