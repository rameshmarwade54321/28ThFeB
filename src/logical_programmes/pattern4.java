package logical_programmes;

public class pattern4 
{
	public static void main(String[] args) 
	{
		int rows=5;  //2<=5
		for(int i=1; i<=rows; i++)
		{                //5<=4
			for (int j=1; j<=rows-i; j++)
			{
				System.out.print(" ");
			}
			            //2<=1
			for(int k=1; k<=i*2-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
