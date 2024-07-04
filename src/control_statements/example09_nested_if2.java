package control_statements;

public class example09_nested_if2 {
public static void main(String[] args) {
	int tomatorate=90;
	if (tomatorate>=80)
	{
		System.out.println("Sell at local market");
		int tomatolocalmarket=150;
		if(tomatolocalmarket>=120)
		{
			System.out.println("sell at APMC market");
		}
		else
		{
			System.out.println("not allowed in APMC");
		}
		
	}
	else
	{
		System.out.println("sell at retail store");
	}
}
}
