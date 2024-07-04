package control_statements;

public class example05_else_if1 {
	public static void main(String[] args) {

		int marks = 20;
		if (marks >= 75) 
		{
			System.out.println("Distinction");
		} 
		else if (marks >= 60 & marks <= 74) 
		{
			System.out.println("first Class");
		} 
		else if (marks >= 50 & marks <= 59) 
		{
			System.out.println("Second class");
		} 
		else if (marks >= 35 & marks <= 49) 
		{
			System.out.println("pass class");
		} 
		else if (marks == 34) {
			System.out.println("grace passing");
		} 
		else {
			System.out.println("failed");
		}

	}
}
