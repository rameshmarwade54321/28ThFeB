package This_super;

public class Demo4  extends Demo3
{

	Demo4 ()
	{
		this(10);
		
		System.out.println("demo4 constructor from subclsss");
	}
	
	
	Demo4 (int a)
	{
		this("ramesh");
		System.out.println("demo4 int constructor from subclsss");
	}
	
	Demo4 (String n)
	{
		super();
		System.out.println("demo4 string constructor from subclsss");
	}
	
	public static void main(String[] args) 
	{
		Demo4 d4=new Demo4();
	}
}


