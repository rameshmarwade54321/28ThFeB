package Access_specifiers;

public class Protected 
{
	protected int a;
	
	protected Protected()
	{
		a=10;
	}
	
	protected void m1() 
	{
		System.out.println(a);
		
		
	}
	
	public static void main(String[] args) 
	{
		Protected p1=new Protected();
		p1.m1();
		System.out.println(p1.a);
	}
}
