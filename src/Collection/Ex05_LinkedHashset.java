package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex05_LinkedHashset 
{
	public static void main(String[] args) 
	{
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add("ramesh");
		lhs.add(50);
		lhs.add('A');
		lhs.add(50.2f);
		lhs.add(null);
		lhs.add(null);
		lhs.add(60);
		lhs.add(50);
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.contains(null));
		lhs.remove(null);
		System.out.println(lhs);
		
		for( Object s1:lhs)
		{
			System.out.println(s1);
		}
		
		Iterator itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
