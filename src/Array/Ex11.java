package Array;

public class Ex11 
{
	public static void main(String[]args)
	{
		char [][]a1= {{'A','B','C'},{'C','D','E'}};
		
		for(int i=0; i<=1; i++)
		{
			for(int j=0; j<=2; j++)
			{
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
