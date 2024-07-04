package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ex11_ListIterator_Bidirectional 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("ramesh");
		al.add("sandesh");
		al.add("adesh");
		al.add("sunil");
		al.add("jyoti");
		
		ListIterator<String> litr =al.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
	}
}
