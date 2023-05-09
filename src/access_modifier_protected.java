import access_modifier.Student;
class Account extends Student{ // outside package by subclass only accessible
	int new_id;
	void setU_id() {
		this.new_id = u_id + 1;
		
	}
	void printNewId() {
		System.out.println("U_id : " + u_id);
		System.out.println("new_id : " + this.new_id);
	}
	
}
public class access_modifier_protected {
	public static void main(String args[]) {
		Student obj = new Student();
		obj.name = "Rahul";
		// obj.u_id = 12345; // not accessible because protected (out side the package)
		
		Account a1 = new Account();
		a1.setU_id();
		a1.printNewId();
		
		
		
	}
}
