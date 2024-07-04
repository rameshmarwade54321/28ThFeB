package Array;

public class Ex06_Singlestep_intArray_StringArray 
{
	public static void main(String[] args) {
		
	
	int []ar1 = {10, 25, 15, 45};
	String[]ar2 = {"Ramesh", "Mahesh", "Sunil", "Aksha"};
		
	//print int array length
	System.out.println(ar1.length);
	//print data of index 2
	System.out.println(ar1[2]);
	// print all data
	for(int i=0; i<=ar1.length-1; i++)
	{
		System.out.println(ar1[i]);
	}
	
	
	System.out.println("------------------------");
	
	System.out.println(ar2.length);
	System.out.println(ar2[3]);
	
	for(int i=0; i<=ar2.length-1; i++)
	{
		System.out.println(ar2[i]);
		
	}
	
	}
}
