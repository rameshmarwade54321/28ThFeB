package Exception_handling;

public class Ex01 
{
	//match the exception of catch block
	public static void main(String[] args) 
	{
		//int [] ar= {10,20,30,40};
		String []str = {"ramesh","pravin","rahul"};
		try
		{
			
			System.out.println(str[4]);
		}
	
		catch(ArrayIndexOutOfBoundsException  a)
		{
			System.out.println("Enter correct Index Number");
		}
		
		System.out.println("hi");
	}
}
