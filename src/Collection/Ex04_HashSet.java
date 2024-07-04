package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex04_HashSet 
{

	public static void main(String[] args) 
	{
	
		HashSet hs=new HashSet();
		
		hs.add("ramesh");
		hs.add(50);
		hs.add('A');
		hs.add(50.2f);
		hs.add(null);
		hs.add(null);
		hs.add(60);
		hs.add(50);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains(50));
		hs.remove(50);
		System.out.println(hs);
		
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
		
		Iterator itr =hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
