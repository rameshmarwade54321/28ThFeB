package control_statements;

public class example07_else_if3 {
	public static void main(String[] args) {
		int carprice = 400000;
		if (carprice >= 700000) {
			System.out.println("discount50% applicable");
		} else if (carprice >= 600000 & carprice <= 699999) {
			System.out.println("discount40% applicable");
		} else if (carprice >= 500000 & carprice <= 599999) {
			System.out.println("discount30% applicable");
		} else if (carprice >= 400001 & carprice <= 499999) {
			System.out.println("discount10% applicable");
		} else {
			System.out.println("No discount applicable");
		}

	}
}
