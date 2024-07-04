package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Ex02_Vector 
{

	public static void main(String[] args) 
	{
	
		Vector v=new Vector(15);
		
		v.add("ramesh");
		v.add("rupesh");
		v.add(50);
		v.add(55.5f);
		v.add('B');
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.get(3));
		System.out.println(v.contains("ramesh"));
		v.add(2, "bhushan");
		System.out.println(v);
		
		v.set(2, "anil");
		System.out.println(v);
		
		v.remove(2);
		System.out.println(v);
		
		for(int i=0; i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("---------------------");
		
		for( Object s1:v) 
		{
			System.out.println(s1);
		}
		
		System.out.println("---------------------------");
		
	Iterator itr=v.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("---------------------------");
	
	ListIterator litr=v.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
			
	System.out.println("----------------------------------------");
	
	Enumeration e1=v.elements();
	while(e1.hasMoreElements())
	{
		System.out.println(e1.nextElement());
	}
	
	
	
	
	
	
	
	}
}

