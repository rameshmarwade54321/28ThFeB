package Array;

import java.util.Arrays;

public class Ex04_StringSorting 
{
	public static void main(String[] args) 
	{
		String []arg=new String[5];
		arg[0]="ramesh";
		arg[1]="anand";
		arg[2]="adesh";
		arg[3]="sunil";
		arg[4]="pratiksha";
		
		Arrays.sort(arg);
		
		for(int i=0; i<=arg.length-1; i++)
		{
			System.out.println(arg[i]);
		}
	}
}
