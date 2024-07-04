package Access_specifiers;

public class Private    
{                   //same class 
	private int a;
	
	private Private()
	{
		a=10;
	}
	
	private void m1() 
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		Private p=new Private();
		p.m1();
		System.out.println(p.a);
	}
	
}
