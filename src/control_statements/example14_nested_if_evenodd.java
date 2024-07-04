package control_statements;

public class example14_nested_if_evenodd 
{
public static void main(String[] args) 
{
	M1(40, 20);
	
	
}
public static void M1(int a, int b) 
{
	int c=(a+b);
	if (c%2==0)
	{
		System.out.println("even number");
		if (c >=0 & c<=55)
		{
			System.out.println("qualify for next round");
		}
		else
		{
			System.out.println("not qualify for next round");
		}
	}
	else
	{
		System.out.println("odd number");
	}
		
}
}
