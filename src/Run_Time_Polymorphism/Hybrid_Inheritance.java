package Run_Time_Polymorphism;
class C  {  
	public void disp(int i)  {  
		System.out.println("C" + i);  
	}  
}  
class A extends C  {  
	public void disp()  {  
		System.out.println("A");  
	}  
}  
class B extends C  {  
	public void disp()  {  
		System.out.println("B");  
	}     
}
class D extends A  {  
	public void disp()  {  
		System.out.println("D");  
	}
}
public class Hybrid_Inheritance {
	public static void main(String args[])  
	{  
		D obj = new D();  
		obj.disp(1);
		obj.disp();  
	}  
}
