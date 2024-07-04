package Array;

public class Ex01_String_Array 
{
	public static void main(String[] args) 
	{
		//array declaration
		String []arg=new String [5];
		
		//array initialization
		arg[0]="ramesh";
		arg[1]="anand";
		arg[2]="Adesh";
		arg[3]="sunil";
		arg[4]="pratiksha";
		
		
		//array usage
		
		System.out.println(arg[0]);
		System.out.println(arg.length);
		
		System.out.println("------------------");
		
		for(int i=0; i<=arg.length-1; i++)
		{
			System.out.println(arg[i]);
		}
				
	}
}
