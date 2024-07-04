package control_statements;

public class example17_switch2 {
public static void main(String[] args) 
{
	String IP="CD";
	switch (IP)
	{
	case "BT": System.out.println("Allow BT");
	
	break;
	
	case "CD": System.out.println("Allow CD");
	int amount =6000;
	if (amount>=5000)
	{
		System.out.println("amount will be release");
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
