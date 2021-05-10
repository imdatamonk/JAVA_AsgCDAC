import java.util.Scanner;

public class Tester 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Point of X and Y cords:\t");
        Point2D p1 = new Point2D(sc.nextDouble(),sc.nextDouble());
        System.out.println("Point's x & y co-ords:\t" + p1.show());

       
        System.out.println("Enter Point of X and Y cords:\t");
        Point2D p2 = new Point2D(sc.nextDouble(),sc.nextDouble());;
        System.out.println("Point's x & y co-ords:\t" + p2.show());
        System.out.println("X and Y cords of Both points are :\t"+ p2.isEqual(p1));
        sc.close();        
    }
    
}
