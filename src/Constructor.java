class myClass1{
	int num1, num2;
	int sum;
	
	public myClass1() {
		System.out.println("I am in default constructor");
	}
	public myClass1(int n, double d) {
		System.out.println("I am in parameterized constructor");
		num1 = n;
		num2 = (int)d;
	}
}
public class Constructor {
	public static void main(String args[]) {
		myClass1 obj = new myClass1(4, 3.555);
		obj.num1=1;
		System.out.println(obj.num2);
		
	}
}
