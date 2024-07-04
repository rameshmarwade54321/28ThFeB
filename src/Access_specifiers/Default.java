package Access_specifiers;

public class Default 
{
	int a;
	
	Default()
	{
		a=10;
	}
	
	void m1() 
	{
		System.out.println(a*a);
	}
	
	
	public static void main(String[] args) 
	{
		Default d=new Default();
		d.m1();
		System.out.println(d.a);
	}
}
