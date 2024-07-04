package UpCasting;

interface I1
{
	void m1();
}
class Impl implements I1
{
	public void m1()
	{
		System.out.println("m1 from Imp1 override from I1");
	}
	public void m2() 
	{
		System.out.println("m2 from Impl");
	}
}
public class Upcasting_downcasting_using_Interface 
{
	public static void main(String[] args) 
	{
		//up casting
		System.out.println("-----upcasting using ineterface-----------");
		I1 obj1= new Impl();
		obj1.m1();
		System.out.println("-----downcasting using interface-----------");
		//down casting
		Impl obj2=(Impl)obj1;
		obj2.m1();
		obj2.m2();
	}
}
