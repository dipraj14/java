package Run_Time_Polymorphism;
class Shape1{
	void printArea() {
		System.out.println("Display area: ");
	}
}
class Triangle1 extends Shape1{
	void area(int l, int h) {
		System.out.println(0.5 * l * h);
	}
}
public class Single_Level_Inheritance {
	public static void main(String args[]) {
		Triangle1 t1 = new Triangle1();
		t1.printArea();
		t1.area(2, 3);
	}
}
