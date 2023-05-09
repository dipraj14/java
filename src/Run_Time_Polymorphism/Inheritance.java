package Run_Time_Polymorphism;

class Shape{
	String colour;
	void printClolour() {
		System.out.print(this.colour);
	}
}
class Triangle extends Shape{
	
}
public class Inheritance {
	public static void main(String args[]) {
		Triangle t1 = new Triangle();
		t1.colour = "red";
		t1.printClolour();
	}

}
