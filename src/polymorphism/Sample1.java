package polymorphism;


//method overloading
public class Sample1 

{
	public static void main(String[] args) 
	{
		System.out.println("predefined main method");
	}
	
//	public static void main(int a) 
//	{
//		System.out.println(a+a);
//	}
//	
//	public void main() 
//	{
//		
//	}
	
	
	
	public static void m0() 
	{
		System.out.println("static method m0 from sample1");
	}
	
//	public static void m0(int a) 
//	{
//		System.out.println(a);
//	}
//	
//	public void m0(int a, int b) 
//	{
//		System.out.println();
//	}
	
	public void m1() 
	{
		System.out.println("m1 from Sample1");
	}
	public void m1(int a) 
	{
		System.out.println(a);
	}
	public void m1(int a, int b) 
	{
		System.out.println(a+b);
	}
	
//	public static void m1(int a, int b, int c) 
//	{
//		
//	}

}
