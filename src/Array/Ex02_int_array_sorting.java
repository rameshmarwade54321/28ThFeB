package Array;

import java.util.Arrays;



public class Ex02_int_array_sorting 
{

	public static void main(String[] args) 
	{
		int []ar=new int[4];
		ar[0]=10;
		ar[1]=30;
		ar[2]=20;
		ar[3]=25;
	  //ar[5]=10;     //ArrayIndexOutOfBoundsException:		
		System.out.println(ar[1]);
		System.out.println(ar.length);
		
		System.out.println("----------------");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
			
		}
		System.out.println("-----ascending order---");
		
		Arrays.sort(ar);
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
			
		}
		
		System.out.println("-----descending order---");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
			
		}
	}
}
