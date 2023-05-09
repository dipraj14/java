class Emp{
	int salary;
	int emp_id;
	static String ceo;
	
	void show() {
		System.out.println(emp_id + " : " + ceo +" : "+ salary);
	}
}
public class StaticDemo {
	
	public static void main(String args[]) {
		Emp navin = new Emp();
		navin.emp_id = 1;
		navin.ceo = "sujit";
		navin.salary = 20000;
		
		Emp rahul = new Emp();
		rahul.emp_id = 4;
		rahul.ceo = "sujit";
		rahul.salary = 50000;
		
		rahul.ceo = "Dipraj";
		
		navin.show();
		rahul.show();
		
		
		
	}

}
