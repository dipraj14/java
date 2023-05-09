package Types_of_interface;
interface A{
	void show();
	default void help() {   // this can be ovverrid in h class  // funcational interface also can have default method 
		System.out.println("Need help");
	}
}
class h implements A{
	public void show() {
		System.out.println("tell me");
	}
}
public class default_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		h obj = new h();
		obj.show();
		obj.help();
	}

}
