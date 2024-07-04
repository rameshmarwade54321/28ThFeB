package logical_programmes;

public class factorial 
{
//		factorial of 1 to 5
//	    1!=1*fact1=1
//	    2!=1*2=2
//	    3!=1*2*3=6
//	    4!=1*2*3*4=24
//	    5!=1*2*3*4*5=120
	
	public static void main(String[] args) {
		
	
	int fact=1;
	
	for (int i=1; i<=10; i++)
	{
		for (int j=1; j<=i; j++)
		{
			fact=fact*j;
		}
		System.out.println(fact);
		fact=1;
	}
		
	}
}
