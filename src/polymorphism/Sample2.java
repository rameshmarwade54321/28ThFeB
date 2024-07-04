package polymorphism;

public class Sample2 extends Sample1
{   
	
	//method hiding
	public static void m0() 
	{
		System.out.println("static method m0 from sample2");
	}

	//method overriding
	public void m1() 
	{
		System.out.println("m1 from sample2");
	}
	
	//method overriding
	public void m1(int a) 
	{
		System.out.println(a+a);
	}
	
	//method overriding
	public void m1(int a, int b) 
	{
		System.out.println(a*b);
	}
	
}


