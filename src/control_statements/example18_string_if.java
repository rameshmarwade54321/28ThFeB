package control_statements;

public class example18_string_if 
{
	public static void main(String[] args) 
	{
		String IP="CD";
		switch (IP)
			{
			case "BT": System.out.println("Allow BT");
	
			break;
			
			case "CD": System.out.println("Allow CD");
			int Notes =200;
			if (Notes==100)
			{
				System.out.println("100 rs notes available");
				int amount=6000;
				if(amount>=5000)
				{
					System.out.println("withdraw");
				}
				else
				{
					System.out.println("not withdraw");
				}
			}
			else 
			{
				System.out.println("amount not released");
			}
			break;
			
			case "AS": System.out.println("Allow AS");
			break;
			
			case "MT": System.out.println("Allow MT");
			break;
			
			default: System.out.println("invalid process");
	}
}
}
