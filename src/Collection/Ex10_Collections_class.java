package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Ex10_Collections_class 
{

	public static void main(String[] args) 
	{

		ArrayList<String> al=new ArrayList<String>();
		
		al.add("ramesh");
		al.add("sandesh");
		al.add("adesh");
		al.add("sunil");
		al.add("jyoti");
		
		System.out.println(al);
//		Collections.sort(al);
//		System.out.println(al);
		
//		TreeSet tr=new TreeSet<>(al);	
//		System.out.println(tr);
		
		Collections.reverse(al);
		System.out.println(al);
		
		
	}
	
}
