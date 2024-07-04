package This_super;

public class Demo2 extends Demo1
{

	
	public void m2()
	
	{
		
		m3();
		
		this.m2(10);
		System.out.println("m2 from subclass");
		super.m1();
	}
	
	public void m3()
	{
		super.m1();
		System.out.println("m3 from subclass");
	}
	
	public void m2(int a)
	{
		System.out.println("m4 from subclass");
		
	}
	
	public static void m5()
	{
		System.out.println("m5");
		
		
	}
	
	public static void m6()
	{
		System.out.println("m6");
		
		
	}
	
	
	public static void main(String[] args) 
	{
		m6();
		Demo2 d2=new Demo2();
		d2.m2();
		
	}
}
