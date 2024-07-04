package constructor;

public class sample05 
{
	int num1;
	int num2;
	String name;
	
	sample05()
	{
		num1=10;
		num2=20;
		name="ramesh";
	}
	
	sample05(int a, int b, String N1)
	{
		num1=a;
		num2=b;
		name=N1;
	}
	
	
	
	public void m1() 
	{
		System.out.println(num1+num2);
		
		System.out.println("------------");
		
		System.out.println(num1*num2);
		
		System.out.println("--------------");
		
		System.out.println(name);
		System.out.println(num1+" "+num2+" "+name);
	}	
	
	public static void main(String[] args) 
	{
		sample05 s5=new sample05();
		s5.m1();
		
		sample05 s6=new sample05(10, 20, "ramesh");
		s6.m1();
		
		
	}
	
	
}
