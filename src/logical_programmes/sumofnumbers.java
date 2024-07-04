package logical_programmes;

public class sumofnumbers 
{
	public static void main(String[] args) 
	{
		int sum=0,i;
		for(i=1; i<=10; i++)
		{
			for(int j=1; j<=i; j++)
			{
				sum=sum+j;
			}
			System.out.println(sum);
			sum=0;
		}
	}
}
