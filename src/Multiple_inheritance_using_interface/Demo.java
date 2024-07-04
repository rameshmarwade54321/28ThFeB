package Multiple_inheritance_using_interface;
//implementation class
public class Demo implements I1, I2, I3
{
	public void m1() 
	{
		System.out.println("method m1 from interface I1 and implemented in demo1");
	}

	
	public void m2() 
	{
		System.out.println("method m2 from interface I1 and implemented in demo1");
	}
	
	public void m3() 
	{
		System.out.println("method m3 from interface I2 and implemented in demo1");	
	}

	
	public void m4() 
	{
		System.out.println("method m4 from interface I2 and implemented in demo1");	
	}

	
	

	
	public void m5() 
	{
		System.out.println("method m5 from interface I1&I2 and implemented in demo1");
	}

	public void m6()
	{
		System.out.println("method m6 from interface I3 and implemented in demo1");
		
	}
	
	
	
}
