package Exception_handling;

public class Ex04 
{
	public static void main(String[] args) 
	{
		//multiple try and catch block allowed in method
		int [] ar = {10,20,30,40};
		String a ="ramesh";
		try 
		{
			System.out.println(ar[5]);
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("1st try-catch ArrayIndexOutOfBounds Exception");
		}
		try 
		{
			System.out.println(a.charAt(7));
		} 
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("2nd try-catch ArrayIndexOutOfBounds Exception");
		}
		
		System.out.println("hi");
		
		
		
		
		
		
	}
}
