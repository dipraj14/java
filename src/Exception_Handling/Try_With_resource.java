package Exception_Handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Try_With_resource {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int n = 0;
		System.out.println("Enter a number");
		
		// no need not close the resources this syntex automatic close the resource
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			
			n = Integer.parseInt(br.readLine());
		}
		
		
		System.out.println(n);
	}

}
