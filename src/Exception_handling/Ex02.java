package Exception_handling;

public class Ex02 
{
	//match the exception of catch block
	public static void main(String[] args) 
	{
			int a=10;
			int b=0;

		try
		{
			System.out.println(a/b);
			
		}
	
		catch(ArithmeticException c)
		{
			System.out.println("Enter correct denominrator");
		}
		
		System.out.println("hi");
	}
}
