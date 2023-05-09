package Run_Time_Polymorphism;

class Y{
	void area() {
		System.out.println("Area of Shape");
	}
}
class Z extends Y{
	void area(int l, int h) {
		System.out.println("Area of triangle is " + 0.5 * l * h);
	}
}
class U extends Z{
	void area(int r) {
		System.out.println("Area of Circle is " + 3.14 *  r * r);
	}
}

public class methodOverriding {
	public static void main(String args[]) {
		Z t1 = new Z();
		t1.area();
		t1.area(2,3);
		
		U obj = new U();
		obj.area();
		obj.area(4);
		obj.area(4, 7);
	}
}
