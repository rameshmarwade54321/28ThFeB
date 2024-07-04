package control_statements;

public class example12_if_else {
public static void main(String[] args) {
	int age = 25;
	int weight=55;
	
	if (age>=18)
	{
		if (weight>=50)
		{
			System.out.println("eligible for donate blood");
		}
		else
		{
			System.out.println("not eligible for donate blood");
		}
			
	}
	else
	{
		System.out.println("not eligible for camp");
	}
}
}
