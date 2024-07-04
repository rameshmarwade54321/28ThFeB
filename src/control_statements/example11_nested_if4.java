package control_statements;

public class example11_nested_if4 {
public static void main(String[] args) {
	int seasontemp=40;
	if(seasontemp>=38)
	{
		System.out.println("summer season");
		int summer=25;
				if(summer<=31 & summer>=1)
				{
				System.out.println( "winter season");
				int winter=14;
				if (winter>=8 & winter<=22)
				{
					System.out.println("it may be winter season or Rainy season");
				}
				else 
				{
					System.out.println("no rainy season");
				}
				}
				else
				{
					System.out.println("no winter season");
				}
	}
	else 
	{
		System.out.println("it is not a summer season");
	}
}
}
