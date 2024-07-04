package constructor;

public class sample01 
{
     
	//default constructor  created by compiler
	//classname () {   body          }    : syntax
	
//	sample1 ()
//	{
//	
//	}

	public void m1() 
	{
		System.out.println("running m1");
	}
	public void m2() 
	{
		System.out.println("running m2");
	}
	public static void main(String[] args) 
	{
		sample01 S1=new sample01();
//in  line 26 : new=new empty space; S1=to identify an object name
		//sample1  = classname(we have created object for this class)
		//sample(); = called constructor to copy the all the members of the class
		
		S1.m1();
		S1.m2();
}
	
}
