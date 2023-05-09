class myClass2{
	int num1, num2;
	int sum;
	
	public myClass2() {
		System.out.println("I am in default constructor");
	}
	public myClass2(int num1, int num2) {
		System.out.println("I am in parameterized constructor");
		this.num1 = num1; // current object
		this.num2 = num2;
	}
}
public class thisKeyword {
	public static void main(String args[]) {
		myClass2 obj = new myClass2(4, 3);
	
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		
	}
}
