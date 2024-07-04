package Array;
import java.util.Arrays;
public class Ex08_practice 
{
	public static void main(String [] args)
	{
		int [] a1= { 10,35,20,10};
		int [] a2= { 35,20,10,10};
		
		String[] a3= { "ramesh", "mayur"};
		
		System.out.println(a1.length);
		
		System.out.println(a2.length);
		
		System.out.println(a1[2]);
		
		
		System.out.println("--------------");
		
		System.out.println(Arrays.equals(a1, a2));
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		System.out.println(Arrays.equals(a1, a2));
		
		
		
	}
}
