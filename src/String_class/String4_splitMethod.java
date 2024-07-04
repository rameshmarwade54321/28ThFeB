package String_class;

public class String4_splitMethod 
{
	public static void main(String[] args) 
	{
		String a= "pune is big city";
		
	     String[] ar=a.split(" ");
	     
	     System.out.println(ar[0]);
	     System.out.println(ar[2]);
	     System.out.println(ar.length);
	     
	     for(int i=0; i<=ar.length-1; i++)
	     {
	    	 System.out.print(ar[i]+" ");
	     }
	     
	     System.out.println();
	     // if we want reverse string like - city big is pune
	     
	     for (int i=ar.length-1; i>=0; i--)
	     {
	    	 System.out.print(ar[i]+" ");
	    	 
	     }
	}
}
