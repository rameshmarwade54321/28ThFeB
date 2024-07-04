package useofstaticandnonstatic;

public class employee2 
{
	String Empname;
	int Empsalary;
	int Empid;
	static String EmpCEO = "Mr.Kunal";  //this name should be same for all employees after update but it is not updated using non static global variable so need to use static global variable
	
	employee2(String N1,int a,int b)
	{
		Empname=N1;
		Empsalary=a;
		Empid=b;
		
		
	}
	
	public void Employeeinfo() 
	{
		System.out.println(Empname+" : "+Empsalary+" : "+Empid+" : "+EmpCEO);
	}
	
	public static void main(String[] args) 
	{
		employee2 e1=new employee2("ramesh", 25000, 201);
		employee2 e2=new employee2("adesh", 30000, 301);
		employee2 e3=new employee2("ramesh", 35000, 401);
		
		e1.Employeeinfo();
		e2.Employeeinfo();
		e3.Employeeinfo();
	}
}
