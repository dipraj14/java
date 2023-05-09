package Run_Time_Polymorphism;
class Shape3 {
	void area() {
		System.out.println("Display area: ");
	}
}
class Triangle3 extends Shape3{
	void area(int l, int h) {
		System.out.println(0.5 * l * h);
	}
}
class circle3 extends Shape3{
	void area(int r) {
		System.out.println(3.14 * r * r);
	}
}

public class Herical_Inheritance {
	public static void main(String args[]) {
		circle3 c1 = new circle3();
		c1.area();
		c1.area(2);
	}
}
