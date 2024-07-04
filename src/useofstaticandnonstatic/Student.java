
package useofstaticandnonstatic;
public class Student
{
String sname;
int srollnum; String spname;
Student(String s1, int n1,String s2)
{
sname=s1;
srollnum=n1; spname=s2;
}
public void studentInfo()
{ System.out.println(sname +" : "+ srollnum + " : "+spname);
}
public static void main(String[] args)
{
Student s1=new Student("Amol", 101, "abc");
Student s2=new Student("Monika", 102, "abc");
Student s3=new Student("Rahul", 103, "xyz");
s1.studentInfo();
s2.studentInfo();
s3.studentInfo();
}
}