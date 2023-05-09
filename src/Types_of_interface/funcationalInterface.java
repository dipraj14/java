package Types_of_interface;


@FunctionalInterface 
interface abc{
	void show();
}
public class funcationalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			 abc s = new abc() {
				public void show() {
					System.out.println("Hi i am Annon");
				}
			};
		 */  // instade of this i use Lamda exp
		
		// lamda expression 
	
		abc s = () -> System.out.println("Hi i am Annon");
		s.show();
	}

}
