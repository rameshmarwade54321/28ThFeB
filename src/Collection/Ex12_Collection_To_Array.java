package Collection;

import java.util.ArrayList;

public class Ex12_Collection_To_Array 
{

	public static void main(String[] args) 
	{
	
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("ramesh");
		al.add("sandesh");
		al.add("adesh");
		al.add("sunil");
		al.add("jyoti");
		
		Object[] str = al.toArray();
		System.out.println(str[0]);
		
		
		
		
	}
}
