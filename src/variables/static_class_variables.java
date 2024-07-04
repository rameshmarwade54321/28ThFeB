package variables;

public class static_class_variables 
{
	
	
	static int a=10; //static global variable
	int f=100; //non static global variable
	
	public static void main(String[] args) 	
	{
		System.out.println(a);  //called static variable from same class
		M1();
		System.out.println(static_variable_from_diffclass.z); //called static variable from diff  class
		
		static_class_variables S1=new static_class_variables();
		System.out.println(S1.f);
	}
	
	public static void M1() 
	{
		System.out.println(a);
		static_class_variables S1=new static_class_variables();
		System.out.println(S1.f);
		
	}
	public static void M2() 
	{
		System.out.println();
	}
	
	public void M3() 
	{
		System.out.println(a);
		System.out.println(f);
	}
}
