package control_statements;

public class all_program {
public static void main(String[] args) 
{
	System.out.println("Below are the variable, methods and statement programmes");
	ITCshare("ITC", 441, 4.3f);
	
	all_program A1=new all_program();
	A1.MutualFund("HDFC", 10, 55.5f);
	
int Colourcode=137;
if (Colourcode>=136) {
	System.out.println("Blue");
}
}
public static void ITCshare(String Name, int Price, Float PEratio ) {
	System.out.println(Name+"-----"+Price+"-----"+PEratio);
}

public void MutualFund(String name, int minvalue, float profitper) {
	System.out.println(name+"--------"+minvalue+"--------"+profitper);
}


}
