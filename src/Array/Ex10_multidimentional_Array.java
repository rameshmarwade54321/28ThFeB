package Array;

import java.util.Arrays;

public class Ex10_multidimentional_Array 
{
	public static void main(String[] args) 
	{
		int [][] a1= {{10,20,30},{40,50,60},{70,80,90}};
		
		System.out.println(a1.length);
		
		System.out.println("--------------------");
		
		
		
		for(int i=0; i<=a1.length-1; i++)
		{
			for(int j=0; j<=2; j++)
			{
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}
			
	}
}
