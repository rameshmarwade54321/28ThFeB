package Inheritance01;

public class Hierarchical_inheritance 
{
	public static void main(String[] args) 
	{
		    System.out.println("----Student1 data------");
			Student1 s1 = new Student1();
			s1.marathi();
			s1.chemistry();
			s1.maths();
			s1.science();
			System.out.println("----Student2 data------");
			Student2 s2=new Student2();
			s2.hindi();
			s2.chemistry();
			s2.maths();
			s2.science();
			System.out.println("----Student2 data------");
			Student3 s3=new Student3();
			s3.history();
			s3.chemistry();
			s3.history();
			s3.science();
	}
}
