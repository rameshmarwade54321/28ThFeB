package Collection;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.ListIterator;

public class Ex01_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
	
		a1.add("ramesh");
		a1.add(10);
		a1.add('B');
		a1.add(55.5f);
		a1.add(null);
			
		a1.add(2, "anand");
		a1.remove(2);
		
		
		System.out.println(a1);
		
		System.out.println(a1.contains("ramesh"));
		System.out.println(a1.size());
		
		System.out.println(a1.get(0));
		
		a1.set(0, "sunil");
		
		System.out.println(a1.get(0));
		
		
		//print array using for loop
		
		for(int i=0; i<a1.size(); i++) 
		{
			System.out.println(a1.get(i));
		}
		
		//print array using foreach loop
		
		
		for(Object s1:a1)
		{
			System.out.println(s1);
		}
		
	Iterator itr = a1.iterator();
	//Iterator itr=	a1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
		
	//print array using ListIterator
		
		ListIterator litr=    a1.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		
		
		
		
	}
}

