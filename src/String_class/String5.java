package String_class;

public class String5 
{

	public static void main(String[] args) 
	{
		String a="ramesh";
		String b="MANGESH";
		String c="my village. is pune";
		String d="";
		String e="    ramesh    ";
		String f="RAMESH";
		
		//length method - return value int
		System.out.println("1.length method  :  "+a.length());
		
		//toUpperCase method - return value string
		System.out.println("2.toUpperCase method :  "+a.toUpperCase());
		
		//toLowerCase method - return value string
		System.out.println("3.toLowerCase method :  "+b.toLowerCase());
		
		//equals method - return value boolean true/false
		System.out.println("4.equals method :  "+a.equals(b));
		
		//equalsIgnoreCase method - return value boolean true/false
		System.out.println("5.equalsIgnoreCase method :  "+a.equalsIgnoreCase(f));
		
		//example of upper/lower case with equal method
		System.out.println(a.toUpperCase().equals(f));
		
		//contains method - return value boolean true/false
		System.out.println("6.contains method :  "+c.contains("pune"));
		
		//startsWith method - return value boolean true/false
		System.out.println("7.startsWith method :  "+c.startsWith("my"));
		
		//endsWith method - return value boolean true/false
		System.out.println("8.endsWith method :  "+c.endsWith("pune"));
		
		//isEmpty method - return value boolean true/false
		System.out.println("9.isEmpty method :  "+a.isEmpty());
		
		//charAT method - return value char
		System.out.println("10.charAT method :  "+a.charAt(4));
		
		//indexOF method - return value int 
		System.out.println("11.indexOF method :  "+a.indexOf('a'));
		
		//lastIndexOf method - return value int 
		System.out.println("12.lastIndexOF method :  "+a.lastIndexOf('s'));
		
		//substring method - return value string
		System.out.println("13.substring method :  "+a.substring(2, 4));
		
		//trim method - return value string
		System.out.println("14.trim method :  "+e.trim());
		
		//concat method - return value string
		System.out.println("15.concat method :  "+a.concat(b));
		
		//replace method - return value string
		System.out.println("16.replace method :  "+a.replace("a", "A"));
		
		//17.split method
		
		        String [] str  = c.split(" ");
		        
		System.out.println(str[1]);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
