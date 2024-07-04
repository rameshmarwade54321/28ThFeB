package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

public class Ex07_ArrayList_HashSet 
{

	public static void main(String[] args) 
	{
	
		ArrayList al=new ArrayList();
		al.add("Rahul");
		al.add(2);
		al.add(65.5f);
		al.add('A');
		al.add(null); 
		al.add(2); 
		al.add(null);
		System.out.println(al);
		HashSet hs=new HashSet(al);
		
		System.out.println(hs);
		
		
		Vector v=new Vector<>();
		v.add("Rahul");
		v.add(2);
		v.add(65.5f);
		v.add('A');
		v.add(null); 
		v.add(2); 
		v.add(null);
		System.out.println(v);
		HashSet hs1=new HashSet(al);
		
		System.out.println(hs1);
		
		
		
	}
}
