package Array;

public class Ex09_Multidimentional_array 
{
	public static void main(String[] args) 
	{
		int[][]a1=new int[2][3];            
		
		a1[0][0]=20;
		a1[0][1]=30;
		a1[0][2]=40;
		a1[1][0]=50;
		a1[1][1]=60;
		a1[1][2]=70;
		
		System.out.println(a1[1][0]);
		System.out.println("----------------");
		
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
