package Multiple_inheritance_using_interface;

public interface I3 
{
	void m6();
	
	default void m7()
	{
		
		System.out.println("default method  m7 from interface I3 ");
		m8();
	}
	
	
	
	private static void m8()
	{
		System.out.println("private method m8 from interface I3");
	}
	
	public static void m9() 
	{
		
		System.out.println("m9 method from I3");
		
	}
}
