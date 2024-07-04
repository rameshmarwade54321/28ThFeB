package Interface_implementation;

public class Demo3 implements Interface3 
{

	public void m1()
	{
		System.out.println("method m1");
	}
	
	public void m2(int a) 
	{
		System.out.println(a*a);
	}
	
	public void m2(String a)
	{
		System.out.println(a);
	}
	
}
