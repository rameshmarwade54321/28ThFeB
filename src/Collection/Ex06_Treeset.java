package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex06_Treeset 
{

	public static void main(String[] args) 
	{
	
		TreeSet tr=new TreeSet();
		
		tr.add(400);
		tr.add(200);
		tr.add(100);
		tr.add(700);
		tr.add(500);
		tr.add(600);
		tr.add(300);
		tr.add(300);
	//	tr.add(null);
		
		/*ClassCastExpension = whenever u have passed heterogeneous type data in 
		  TreeSet then this exception occurred 
		*NullPointException = whenever u have passed homogeneous data with null data 
		in TreeSet then this exception occurred */
	
		System.out.println(tr);
		
		System.out.println(tr.size());
		System.out.println(tr.contains(500));
		tr.remove(400);
		System.out.println(tr);
		
		System.out.println(tr.first());
		System.out.println(tr.last());
		
		tr.pollFirst();
		System.out.println(tr);
		
		tr.pollLast();
		System.out.println(tr);
		
		for( Object s1:tr)
		{
			System.out.println(s1);
		}
		
		Iterator itr=tr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Iterator ditr = tr.descendingIterator();
		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}
		
		
		
		
	}
}
