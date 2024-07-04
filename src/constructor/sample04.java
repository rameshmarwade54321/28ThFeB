package constructor;

public class sample04 
{
	int b;
	
	
	sample04(int d)
	{
		b=d;
	}
	
	
	
	public void m1() 
	{
		System.out.println(b*b);
	}
	
	public static void main(String[] args) 
	{
		sample04 S4=new sample04(10);
		System.out.println(S4.b);
		S4.m1();
		
		sample04 S5=new sample04(20);
		S5.m1();
		
	}
}
