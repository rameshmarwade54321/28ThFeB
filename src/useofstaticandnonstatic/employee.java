package useofstaticandnonstatic;

public class employee 
{
	String Empname;
	int Empsalary;
	int Empid;
	String EmpCEO;  //this name should be same for all employees after update but it is not updated using non static global variable so need to use static global variable
	
	employee(String N1,int a,int b,String N2)
	{
		Empname=N1;
		Empsalary=a;
		Empid=b;
		EmpCEO=N2;
		
	}
	
	public void Employeeinfo() 
	{
		System.out.println(Empname+" : "+Empsalary+" : "+Empid+" : "+EmpCEO);
	}
	
	public static void main(String[] args) 
	{
		employee e1=new employee("ramesh", 25000, 201, "Mr.anand");
		employee e2=new employee("adesh", 30000, 301, "Mr.anand");
		employee e3=new employee("ramesh", 35000, 401, "Mr.Kunal");
		
		e1.Employeeinfo();
		e2.Employeeinfo();
		e3.Employeeinfo();
	}
}
