package logical_programmes;

public class pattern1 
{
	public static void main(String[] args) 
	{
		int rows=5;  //5<5
		for(int i=0; i<rows; i++)
		{
			           //0<=4
			for(int j=0;j<=i; j++)
			{
				System.out.print("* ");
			}
//				                              * 
//				                              * * 
//				                              * * * 
//				                              * * * * 
//				                              * * * * * 
			System.out.println();
			
		}
	}
}
