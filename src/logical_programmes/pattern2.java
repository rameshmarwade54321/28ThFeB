package logical_programmes;

public class pattern2
{
	public static void main(String[] args) 
	{
		int rows=5;
		for(int i=0; i<rows; i++)
		{
			for(int j=0;j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		System.out.println("-------------------------");
		int row1=5;
		for (int a=0; a<row1; a++)
		{
			for(int b=row1; b>a; b--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
