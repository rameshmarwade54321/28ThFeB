package UpCasting;

public class Test_UpCasting_Downcasting 
{
	public static void main(String[] args) 
	{
		 Parent   t1=new Child();     //up casting
		 t1.home();
		 
		 Child t2=(Child)t1;     //down casting
	     t2.car();
	     t2.home();
	}
}
