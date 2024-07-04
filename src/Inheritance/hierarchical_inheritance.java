package Inheritance;

public class hierarchical_inheritance 
{
	public static void main(String[] args) 
	{
		
		System.out.println("------ Property of son1 -----");
		Son1 s=new Son1();   
		s.mobile();
		s.car();
		s.home();
		s.money();
		System.out.println("----- Property of son2 -----");
		Son2 s1=new Son2();
		s1.bike();
		s1.car();s1.home();
		s1.money();
		System.out.println("----- Property of son3 ----");
		Son3 s2=new Son3();
		s2.tv();
		s2.car();
		s2.home();
		s2.money();
		
	}
}
