package logical_programmes;

public class sumof_1to10numbers 

{     // program of sumof_1to10numbers for 1 to 10

	
//		1+sum0=1
//		2+1=3
//		3+3=6
//		4+6=10
//		5+10=15
//		6+15=21
//		7+21=28
//		8+28=36
//		9+36=45
//		10+45=55
		
//		int sum=0;
//		for(int i=0; i<=20; i++)
//		{
//			for (int j=1; j<=i; j++)
//			{
//				sum=sum+j;
//			}
//			System.out.println(sum);
//			sum=0;
//		}
		
		
		    public static void main(String[] args) {
		        int sum = 0;

		        // Outer loop to iterate from 1 to 20
		        for (int i = 1; i <= 20; i++) {
		            // Inner loop to calculate the sum of numbers from 1 to i
		            for (int j = 1; j <= i; j++) {
		                sum = sum + j; // Add j to the sum
		            }
		            System.out.println(sum); // Print the sum
		            sum = 0; // Reset sum to 0 for the next iteration
		        }
		    
		}
		
	    
		
		
	
	
}
