package constructor;

public class sample02 
{
	int a;  //instance variable
	int b;  //instance variable
	
	
	static int c = 10;
	
	
	sample02()                 //user defined constructor
	{
		a=10;                 //variable initialization
		b=20;                  //variable initialization
		
	}
	
	//constructor use;
	//1.to initialization of variable
	//2.to copy/load all the members of class into object
	
	
	//variable usage
	public void m1() 
	{
		
		int a=10;
		
		
		System.out.println(a+b);
	}
	public void m2() 
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) 
	{
		sample02 S2=new sample02();
				S2.m1();
				S2.m2();
				
		sample03 S3=new sample03();
				S3.m3();
	}
	
	
}
