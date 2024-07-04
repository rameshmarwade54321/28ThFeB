package Collection;

import java.util.TreeSet;

public class Ex09_generic2 
{

	public static void main(String[] args) 
	{
		TreeSet<Integer> tr=new TreeSet<Integer>();
		tr.add(100);
		tr.add(200);
		tr.add(300);
		tr.add(400);
		
		System.out.println(tr);
		
		for(Integer s1:tr)
		{
			System.out.println(s1);
		}
		
		
		
		
		
		
		
	}
	
}
