package String_class;

public class String2 
{
	public static void main(String[] args) 
	{
		String a="ramesh";
		String c="";
		String b="abcxyzacbd";
		
		//to check string is empty or not
		System.out.println(a.isEmpty());
		System.out.println(c.isEmpty());
		
		// to check char index in string
		System.out.println(a.charAt(3));
		System.out.println(a.charAt(2));
		
		//to find out index of char in string occurrence from left side/starting
		System.out.println(b.indexOf('a'));
		System.out.println(b.indexOf('d'));
		
		//to find out index of char in string occurrence from right side/ending
		System.out.println(b.lastIndexOf('a'));
		System.out.println(b.lastIndexOf('d'));
		
		//to find out substring from string 
		System.out.println(b.substring(3));
		System.out.println(b.substring(5));
		System.out.println(b.substring(3, 7));
		
		
	}
	
}
