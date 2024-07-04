package useofstaticandnonstatic;

public class Student1 
{
	String sname;
	int srollnum;
	static String spname="xyz";
	Student1(String s1, int n1)
	{
	sname=s1;
	srollnum=n1;
	}
	public void studentInfo()
	{
	System.out.println(sname +" : "+ srollnum + " : "+spname);
	}
	public static void main(String[] args)
	{
	Student1 s1=new Student1("Amol", 101);
	Student1 s2=new Student1("Monika", 102);
	Student1 s3=new Student1("Rahul", 103);
	s1.studentInfo();
	s2.studentInfo();
	s3.studentInfo();
	}
	}

