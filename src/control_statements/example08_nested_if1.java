package control_statements;

public class example08_nested_if1 {
	public static void main(String[] args) {
		int PEXM = 350;
		if (PEXM >= 400) 
		{                  // if (condition) {body }
			System.out.println("selected for MEXM");
			int MEXM = 800;
			if (MEXM >= 700) 
			{
				System.out.println("selected for Interview ");
				int Interview = 10;
				if (Interview >= 8) 
				{
					System.out.println("selected for IPS");
				} 
				else 
				{
					System.out.println("Rejected from Interview");
				}
			} 
			else 
			{
				System.out.println("not selected for interview");
			}
		} 
		else 
		{
			System.out.println("not selected");
		}
	}
}
