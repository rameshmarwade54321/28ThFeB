package logical_programmes;

public class addition_1_to_10
{

    public static void m1()
    {

        int sum = 0 ;
         for(int i = 1 ; i <= 10 ; i++)
         {
             for(int j = 1 ; j <= i; j++ )
             {
                sum = sum + j ;
             }
             System.out.println( sum) ;
             sum = 0 ;
         }

    }

    public static void main(String[] args)
    {
        m1() ;


    }
}
