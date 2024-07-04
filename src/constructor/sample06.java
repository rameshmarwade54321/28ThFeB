package constructor;

public class sample06 
{
	int num1;
	int num2;
	String name;
	float per;
	char grade;
	
	sample06()    //zero parameter
	{
		num1=10;
		num2=20;
		name="ramesh";
		per=55.5f;
		grade='A';
			
	}
	
	sample06(int a, int b)
	{
		num1=a;
		num2=b;
		
	}
	
	
	sample06(int c,int d, String N1, float Percentage, char grd )
	{
		num1=c;
		num2=d;
		name=N1;
		per=Percentage;
		grade=grd;
		
	}
	
	public void m1() 
	{
		System.out.println(num1+num2);
		System.out.println(name);
		System.out.println(per);
		System.out.println(grade);
	}
	
	public void m2() 
	{
		System.out.println(num1*num2);
		System.out.println(name+"  "+per+"  "+grade);
	}
	
	public static void main(String[] args) 
	{
		sample06 S6=new sample06();
				S6.m1();
				System.out.println("------------");
				S6.m2();
				System.out.println("------------");
		
		sample06 S7=new sample06(20, 40);
				S7.m1();
				System.out.println("------------");
				S7.m2();
				System.out.println("------------");
				
		sample06 S8=new sample06(20,20,"ramesh", 6.2f, 'A');
				S8.m1();
				System.out.println("------------");
				S8.m2();
	}
	
	
	
}
