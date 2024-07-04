package control_statements;

public class example15 
{
public static void main(String[] args) 
{
	int Pmarks = 500;
	int Mmarks = 800;
	int Imarks = 70;
	
	if (Pmarks>= 450)
	{
		System.out.println("Eligible for Mains");
		if (Mmarks>=750)
		{
			System.out.println("select for interview");
			if (Imarks>=80)
			{
				System.out.println("select for the Class one officer");
			}
			else
			{
				System.out.println("not selected for the post");
			}
		}
		else
		{
			System.out.println("not select for interview");
		}
	}
	else 
	{
		System.out.println("not eligible");
	}
}
}
