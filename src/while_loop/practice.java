package while_loop;

public class practice 
{
	public static void main(String[] args) 
	{
		
		M1(6, 7, 8);
		System.out.println("---------------------");
		M1(1, 2, 3);
		
		//1 to 5 number print
		int i = 1;
		while(i<=5)                   //for (int i=1; i<=5; i++)
		{
			System.out.println(i);      //1   2
			i++;
		}
		System.out.println("-------------------------------------------");
		int a = 1;
		while(a<=5)                   //for (int i=1; i<=5; i++)
		{
			System.out.println("My wife Megha");      //1   2
			a++;
		}
		System.out.println("-------------------------------------------");
		for(int b=5; b>=1; b--) 
		{
			System.out.println(b);
		}
		
		System.out.println("-----------------------------------");
		int num=2;
		for (int c =1; c<=10; c++)
		{
			System.out.println(num*c);
		}
		System.out.println("-----------------------------------");
		
		for (int d =1; d <=5; d++)
		{
			int e=d*d;
			System.out.println("square of "+d+" is "+e);
		}
		
		System.out.println("-----------------------------------");
		
		int f = 1;
		while(f<=5)		
		{
			int g=f*f*f;
			System.out.println(g +" is cube of "+f);
			f++;
		}
		
		System.out.println("-----------------------------------");
		
		//int h=2, j=3, k=4, l=5;
		for(int m=1;m<=10; m++ )
		{
			int n=2*m, o=3*m, p=4*m, q=5*m;
			
			System.out.println(n*n+"      "+o*o+"     "+p*p+"    "+q*q);
		}
			
	}
		public static void M1(int x,int y,int z) 
		{
			for (int w=1; w<=10; w++)
			{
				System.out.println(w*x+"   "+w*y+"   "+w*z);
			}
		}
}
