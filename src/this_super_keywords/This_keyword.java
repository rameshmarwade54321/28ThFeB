package this_super_keywords;

public class This_keyword extends Super_keyword
{
	
	//if the global and local variables are same ,  then to access the global variable in same method we need to use "this" keyword
	int a;
	
	This_keyword()
	{
		a=10;
	}
	
	public void m1() 
	{
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args) 
	{
		
		This_keyword obj=new This_keyword();
		obj.m1();
		
		

	}
	
	
}
