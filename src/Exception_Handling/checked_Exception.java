package Exception_Handling;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class checked_Exception {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int n = 0;
		System.out.println("Enter a number");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			br.close();
		}
		
		System.out.println(n);
	}

}
