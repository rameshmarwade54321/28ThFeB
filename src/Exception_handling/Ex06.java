package Exception_handling;

public class Ex06 
{
	public static void main(String[] args) 
	{
		//nested try
		int [] ar = {10,20,30,40};
		String s="ramesh";
		
		try     //outer try
		{
			System.out.println(ar[5]);
			try   //inner try
			{
				System.out.println(s.charAt(7));
			} 
			catch (StringIndexOutOfBoundsException e) 
			{
				System.out.println("StringIndexOutOfBoundsException ");
			}
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		System.out.println("hi");
	}
}
