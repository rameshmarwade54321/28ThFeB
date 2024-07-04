package Access_specifiers;

 public class Public 
{

	public int a;
	
	public Public()
	{
		a=10;
	}
	
	public void m1()
	{
		System.out.println(a+a);
	}
	
	public static void main(String[] args) 
	{
		Public p1=new Public();
		System.out.println(p1.a);
		p1.m1();
	}
}
