/*Solve Accept 2 double values from User (using Scanner). Check data type.(hasNextDouble). 
  If arguments are not doubles , supply suitable error message & terminate.
  If numbers are double values , print its average.
*/
import java.util.Scanner;
class Day1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of X:\t");
        if(sc.hasNextDouble())
        {
            double numx = sc.nextDouble();
            System.out.println("Enter Value of y:\t");
            if(sc.hasNextDouble())
            {
                double numy = sc.nextDouble();
                double avrg = ((numx+numy)/2);
                System.out.println("Average of X and Y Value is:\n"+avrg);
            }
            else
            {
                System.out.println("Enter Correct Value");
            }
        }
        else
        {
            System.out.println("Enter Correct Value");
    
        }
        sc.close();
    
        
    }
    
    
}