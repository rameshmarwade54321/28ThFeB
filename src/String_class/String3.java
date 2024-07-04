package String_class;

public class String3 
{
	public static void main(String[] args) 
	{
		
		String a="mahavir";
		String c=" jayanti";
		String d="    abc    ";
		String b="my name is  ramesh";
		
		//concat method 
		System.out.println(a.concat(c));
		
		//trim method used to remove space before and after the string
		System.out.println(d.trim());
		
		//replace method is used to replace two string
		System.out.println(b.replace("my", "i").replace("name", "am").replace("is", "a"));
		
		
		
		
		
	}

	
}
