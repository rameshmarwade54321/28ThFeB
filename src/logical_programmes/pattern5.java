package logical_programmes;

public class pattern5 
{
	public static void main(String[] args) 
	{
		int rows=5;
		for (int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows+i; j++)
			{
				System.out.print("*");
			}
			for (int k=i*2+1; k>=1;k--)
			{
				System.out.print(" ");
			}
			System.out.println();
		
		}
	}
}
