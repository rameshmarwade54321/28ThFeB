package Interface_implementation;

public class Demo1 implements  Interface1

{
	public void m1()
	{
		System.out.println("m1 from Test interface");
		System.out.println(a);
	}
	
	public void m2()
	{
		System.out.println("m2 from Test interface");
		System.out.println(a+a);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("ramesh");
	}
	
	
}
