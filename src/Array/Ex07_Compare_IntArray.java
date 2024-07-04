package Array;

import java.util.Arrays;

public class Ex07_Compare_IntArray 
{
	public static void main(String[] args) 
	{
		int [] ar1= {10,40,22,55,30};
		int [] ar2= {11,66,20,10,30};
		
		System.out.println(Arrays.equals(ar1, ar2));
		
		System.out.println("------------------");
		
		int [] ar3= {10,30,20,40};
		int [] ar4= {20,30,40,10};
		
		Arrays.sort(ar3);
		Arrays.sort(ar4);
		
		
		System.out.println(Arrays.equals(ar3, ar4));
		
	}
}
