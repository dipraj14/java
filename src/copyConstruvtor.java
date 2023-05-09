class Student{
	int age;
	String name;
	
	void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Student(Student s2){
		name = s2.name;
		age = s2.age;
	}
	Student(){ } 
}
public class copyConstruvtor {
	public static void main(String args[]) {
		Student s1 = new Student();
		s1.name = "Dipraj";
		s1.age = 23;
		
		Student s2 = new Student(s1);
		
		s1.printInfo();
		s2.printInfo();
	}

}
