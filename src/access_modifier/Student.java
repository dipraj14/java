package access_modifier;
//class Bank{
//	public String name;
//	protected int u_id;
//	private int b;
//	
//	int getter(){
//		return b;
//	}
//	void setter(int b){
//		this.b = b;
//	}
//}
public class Student {
	public String name;
	protected int u_id = 13;
	private int b;
	
	int getter(){
		return b;
	}
	void setter(int b){
		this.b = b;
	}
	public static void main(String args[]) {
		Student b1 = new Student();
		b1.name = "Dipraj daripa";
		b1.u_id = 1234;
		b1.setter(2300);
		System.out.println(b1.getter());
	}
	
	
}
