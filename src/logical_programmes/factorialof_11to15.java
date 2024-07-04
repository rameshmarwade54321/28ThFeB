package logical_programmes;

public class factorialof_11to15 
{
	public static void main(String[] args) 
	{
	   int fact=1;
	   for(int i=11; i<=15; i++)
	   {
		   for(int j=1; j<=i; j++)
		   {
			   fact=fact*j;
		   }
		   System.out.println(fact);
		   fact=1;
	   }
		
		
	}
}
