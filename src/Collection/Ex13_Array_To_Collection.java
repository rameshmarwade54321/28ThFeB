package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex13_Array_To_Collection 
{

	public static void main(String[] args) 
	{
	
		String[]str= {"ramesh","aditi","pravin","kunal"};
		List<String> al = Arrays.asList(str);
		
		System.out.println(al.get(3));
		
		
		Integer [] ar= {10,20,30,40};
		
		List<Integer> list1 = Arrays.asList(ar);
		System.out.println(list1);
		
	    
	
	
		
		
	}
}
