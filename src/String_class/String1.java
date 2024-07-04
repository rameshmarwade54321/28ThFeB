package String_class;
public class String1 
{
	public static void main(String[] args) 
	{
		
	
	String name="ramesh";   //1.name=ramesh *
	
	name=name+"marwade";     //2.name=ramesh marwade
	
	String name1;    //empty object name1
	name1="shital";   //shital object name1
	
	name1=name1+"mayur";   //3. mayur  name1
	name1=name1.concat("ramesh");
	
	
	String n1=new String("Amol");
	
	
	
	String name2="ramesh";  //constant
	
	String name3="ramesh";   //constant
	
	String name4="ganesh";    //constant
	
	
	String name5= new String ("ramesh"); //nonc
	
	String name6= new String ("ramesh");  //nco
	
	String name7= new String ("ganesh"); //nonc
	
	
	System.out.println(name5==name6);
	
	
	System.out.println(name.length());
	
	
	System.out.println(name5.toUpperCase());//copy
	
	name5=name5.toUpperCase();
	
	System.out.println(name5);
//	System.out.println(name5.toLowerCase());
//	
//	name5=name5.toLowerCase();
//	
//	System.out.println(name5);
	
	System.out.println(name2.equals(name3));
	
	System.out.println(name2.equals(name5));
	
	System.out.println(name2.equalsIgnoreCase(name5));
	
	String n2="i am a ramesh 3 marwade";
	
	System.out.println(n2.contains("3"));
	
	System.out.println(n2.contains(" am"));
	
	System.out.println(n2.startsWith("i"));
	System.out.println(n2.endsWith("marwade"));

}
	
	
	
}