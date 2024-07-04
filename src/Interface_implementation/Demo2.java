package Interface_implementation;

public class Demo2 implements Interface2
{
	public void m1()
	{
		System.out.println("m1 from implements interface2");
	}
	
	public void m1(int a)
	{
		System.out.println("m1 parametrised  from implements interface2");
		System.out.println(a+a);
	}
	
	
}
