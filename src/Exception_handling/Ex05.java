package Exception_handling;

public class Ex05 
{
	//generic exception. supermost exception class
	public static void main(String[] args) 
	{
		int [] ar = {10,20,30,40};
		
		try 
		{
			System.out.println(ar[5]);
		} 
		catch (Exception e) 
		{
			System.out.println("generic exception handlwed" );
		}
		System.out.println("hi");
	}
}
