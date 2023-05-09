package Exception_Handling;

public class UserDefine_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {	
			int i = 9;
			int j = 8;
			
			int k = i / j;
			
			if(k == 1) throw new dipraj14_Exception("This is not accept");
			
			System.out.println("the value of k = " + k);
		}
		catch(dipraj14_Exception e){
			System.out.println("Error : " + e.getMessage());
		}
	}
}
