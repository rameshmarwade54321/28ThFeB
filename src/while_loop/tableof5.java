package while_loop;

public class tableof5 
{
	public static void main(String[] args) 
	{
//		5*1=5
//		5*2=10
//		5*3=15
//		5*4=20
		System.out.println("-------Table of 5 using while loop--------------");
		int i=1;
		while(i<=10)
		{
			int j=5*i;
			System.out.println(j);
			i++;
		}
		
		System.out.println("-------Table of 5 using for loop--------------");
		
		for(int a=1; a<=10; a++)
		{
			int b=5*a;
			System.out.println(b);
			
		}
		
	}
	
	
}
