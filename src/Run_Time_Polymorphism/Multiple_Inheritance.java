package Run_Time_Polymorphism;
 
interface one {
    public void print_geek();
}
 
interface two {
    public void print_for();
}
 
interface three extends one, two {
    public void print_geek();
}
class child implements one,two {

    public void print_geek()
    {
        System.out.println("Geeks");
    }
 
    public void print_for() { System.out.println("for"); }
}
public class Multiple_Inheritance {

	public static void main(String[] args)
    {
        child c = new child();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }

}
