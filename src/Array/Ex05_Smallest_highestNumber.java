package Array;

import java.util.Arrays;

public class Ex05_Smallest_highestNumber 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[4];
		ar[0]=11;
		ar[1]=24;
		ar[2]=55;
		ar[3]=9;
		
		Arrays.sort(ar);
		
		System.out.println("smallest number : "+ar[0]);
		System.out.println("Highest number : "+ar[ar.length-1]);
	}
}
