package constructor;

public class sample08 
{
	int num1;
	int num2;
	
	sample08(int a, int b)
	{
		num1=a;
		num2=b;
	}
	
	sample08(sample08 S5)
	{
		num1=S5.num1;
		num2=S5.num2;
	}
	
	public void m1() 
	{
		System.out.println(num1+num2);
	}
	
	public void m2() 
	{
		System.out.println(num1*num2);
	}	
	
	public static void main(String[] args) 
	{
		sample08 S8=new sample08(10, 80);
		S8.m1();
		S8.m2();
		
		sample08 S1=new sample08(S8);
		S1.m1();
		S1.m2();
		
	}
	
}
