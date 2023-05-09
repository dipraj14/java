class myClass{
	int num1, num2;
	int sum;
	
	void add() {
		sum = num1 + num2;
	}
}
public class FiirstCode {
	public static void main(String args[]) {
		myClass obj = new myClass();
		obj.num1 = 3;
		obj.num2 = 4;
		obj.add();
		System.out.print(obj.sum);
	}

}
