//Create a Point class Point2D  for representing a point in x-y co-ordinate system.

public class Point2D 
{
    private double x,y;
    //5.1 Create a parameterized constructor to accept x & y co-ords.
    Point2D(double X,double Y)
    {
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
    public boolean isEqual(Point2D p2)
    {
        if(p2.getX() == this.x && p2.getY() == this.y)
        {
            return true;
        }
        return false;
    }
}