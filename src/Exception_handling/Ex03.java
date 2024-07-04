package Exception_handling;



public class Ex03 
{
	//multiple catch block allowed but exception should be different
	public static void main(String[] args) 
	{
		
		int [] ar = {10,20,30,40};
		
		try
		{
			System.out.println(ar[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception handled");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBounds Exception handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
		
		
		
		System.out.println("hi");
		
		
	}
}
