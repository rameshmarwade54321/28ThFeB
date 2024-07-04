package logical_programmes;

public class addition 
{
	public static void main(String[] args) 
	
	{
		
		// 1 to 5 addition like 1+sum0=1 1+2=3, 1+2+3=6, 1+2+3+4=10 ......
		
//		0+1=1
//		1+2=3
//		1+2+3=6
//		1+2+3+4=10
//		1+2+3+4+5=15
//		sum=sum+i
		
		int sum=0,i;
		for(i=1;i<=5;i++)
		{
			sum=sum+i;
			System.out.println(sum);     // 1  3
		}
		
		System.out.println("-----------");
		System.out.println(sum);
		
		
		
		
		
		
	}
	
	
	
}
