package Collection;

import java.io.InterruptedIOException;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex03_LinkedList 
{

	public static void main (String[]args)  
	{
		LinkedList ll=new LinkedList();
		
		ll.add("ramesh");
		ll.add(50);
		ll.add('A');
		ll.add(50.2f);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.contains("ramesh"));
		try
		{
		System.out.println(ll.get(5));
		}
		catch(Exception e)
		{
			System.out.println(2);
		}
		
		ll.add(0, "pravin");
		System.out.println(ll);
		
		ll.remove(0);
		System.out.println(ll);
		
		for(int i=0; i<=ll.size()-1; i++)
		{
			System.out.println(ll.get(i));
		}
		
		for(Object s1:ll)
		{
			System.out.println(s1);
		}
		
	Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	
	
	}
}
