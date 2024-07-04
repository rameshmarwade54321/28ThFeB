package control_statements;

public class division1_if_else_evenodd 
{
public static void main(String[] args) 
{
	M1(35, 8);
	M1(15, 39);
	
}
public static void M1(int a, int b) {                                //><=%
//	int d=10;
	
	int c = (a+b);
	System.out.println(c);
	if (c%2==0)
	{
		System.out.println("c is even");
	}
	else
	{
		System.out.println("c is odd");
	}
}
}
