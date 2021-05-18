/*1.5 Write TestPoint class , under "tester" package with a main method
Accept co ordinates of 2 points from user (Scanner) --p1 & p2*/

package com.app.tester;
import java.util.Scanner;
import com.app.geometry.Point2D;

public class Tester 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    //Use show method to display point details.(p1's details & p2's details)
	    System.out.println("Enter Point of X and Y cords:\t");
	    Point2D p1 = new Point2D(sc.nextDouble(),sc.nextDouble());
	    System.out.println("\nPoint's x & y co-ords:\t" + p1.show());

	       
	    System.out.println("\nEnter Point of X and Y cords:\t");
	    Point2D p2 = new Point2D(sc.nextDouble(),sc.nextDouble());;
	    System.out.println("\nPoint's x & y co-ords:\t" + p2.show());
	    System.out.println("\nX and Y cords of Both points are :\t" + (p2.isEqual(p1) ? "Localted at Sampe point" : "Located at Diff Point"));
	    
	    System.out.println("\nDistance between is:\t" + p1.calculateDistance(p2) );
	    sc.close();        
	    }

}
