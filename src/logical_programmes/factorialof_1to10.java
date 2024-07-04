package logical_programmes;

//factorial of 1 to 5
//1!=1*fact1=1
//2!=1*2=2
//3!=1*2*3=6
//4!=1*2*3*4=24
//5!=1*2*3*4*5=120
//61=5!*6=

public class factorialof_1to10 
{
	public static void main(String[] args) 
	{
		int fact=1,i;
		
		for(i=1; i<=5; i++)
		{         
			fact=fact*i;       //1 2 6  24   120
			
		}
		System.out.println(fact);
		
		
		
		
	}
}
