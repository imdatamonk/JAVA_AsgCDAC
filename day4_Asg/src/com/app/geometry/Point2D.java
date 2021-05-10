package com.app.geometry;
//import java.lang.Math;

//Create a Point class Point2D , under package com.app.geometry  : for representing a point in x-y co-ordinate system.
public class Point2D 
{
	private double x,y;
    //1.1 Create a parameterized constructor to accept x & y co-ords.
    public Point2D(double X,double Y){
        this.x = X;
        this.y = Y;
    }

    public double getX(){
        return x;
    }

    public double getY() {
        return y;  
    }

    //Add public String show()) --to return point's x & y co-ords
    public String show(){
        return this.x + "\t" +this.y;
    }
     
    //Add isEqual method to Point2D class : boolean returning method : must return true if both points are having same x,y co-ords or false otherwise. : 
    public boolean isEqual(Point2D p2){
    	return (p2.getX() == this.x && p2.getY() == this.y);
    }

    /*1.4 Add calculateDistance method to calculate distance between current point n  specified point & return the distance to the caller.
    (eg double  calcDistance(Point2D p2))
    Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.*/
    public double calculateDistance(Point2D p2) {
    	return Math.sqrt((Math.pow((p2.getX() - this.x), 2)) + (Math.pow((p2.getY() - this.y), 2)));	
    }
}
