package logical_programmes;

public class numbers_swaping 
{
		public static void main(String[] args) 
		{
			
			int a=10;
			int b=20;
			//int temp;
			System.out.println("Numbers before swiping");
			System.out.println("Number a is "+a);
			System.out.println("Number b is "+b);
			
//			temp=a;   //temp=10
//			b=a;    //b=10
//			a=temp+b;
			
			b=a;    //b=10
			a=a+a;   //a=20
			
			a=a+b;   //a=30  
			b=a-b;    //b=10
			a=a-b;     //a=20
			
			
			
			System.out.println("--------------------");
			System.out.println("Numbers after swiping");
			System.out.println("Number a is "+a);
			System.out.println("Number b is "+b);
			
			
		}
	
}
