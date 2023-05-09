package Run_Time_Polymorphism;
class Shape2{
	void area() {
		System.out.println("Display area: ");
	}
}
class Triangle2 extends Shape2{
	void area_1(int l, int h) {
		System.out.println(0.5 * l* h);
	}
}
class Equilateral_Triangle2 extends Triangle2{
	void area(int l, int h) {
		System.out.println("area: " + 0.5 * l * h);
	}
}
public class Multi_level_Inheritance {
	public static void main(String args[]) {
		Equilateral_Triangle2 t1 = new Equilateral_Triangle2();
		t1.area();
		t1.area_1(4, 5);
		t1.area(2, 3);
	}
}
