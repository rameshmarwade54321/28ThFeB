package control_statements;

public class example06_else_if2 
{
	public static void main(String[] args) 
	{
		int SharePrice = 345;
		if (SharePrice >= 450) 
		{
			System.out.println("will not purchase stock");
		} 
		else if (SharePrice >= 400 & SharePrice <= 449) 
		{
			System.out.println("will think to purchase");
		} 
		else if (SharePrice >= 350 & SharePrice <= 399) 
		{
			System.out.println("will purchase stock");
		} 
		else 
		{
			System.out.println("will purchase bulk quantity");
		}

	}
}
