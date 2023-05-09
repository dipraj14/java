class myClass3{
	void add(int i, int j , int k) {
		System.out.println(i + j + k);
	}
	void add(int i, int j) {
		System.out.println(i + j);
	}
	void add(int i , int j , int k , int n) {
		System.out.println(i + j + k + n);
	}
}
public class MethodOverloading {
	public static void main(String args[]) {
		myClass3 obj = new myClass3();
		obj.add(23, 45);
		obj.add(8, 7, 2, 3);
	    
		
	}
}
