/*2. Open Box.java.
2.1 Add another constructor to create a cube.
2.2 Add a method to Box class to compare equality of 2 boxes.
This method should return true if the dimensions of 2 boxes are same , otherwise return false.
(eg method name : checkEquality)
*/ 

public class Box 
{
    private double width, depth, height;
    Box(double w, double d, double height) 
    {
        this.width = w;
        this.depth = d;
        this.height = height;
    }
    Box(double w1)
    {
       //width = w1;
        //depth = w1;
        //height = w1;
        this(w1,w1,w1);   // Example of constructor calling... calling one cosntructor from another is called as const chaining..using this ref
    }

    public double getWidth() {
        return width;
    }

    public double getDepth(){
        return depth;
    }

    public double getHeight(){
        return height;
    }

    String getBoxDimensions() {
        return "Box Dims " + this.width + " " + this.depth + " " + this.height;
    }

    double computeBoxVolume() {
        //volume of cube
        return width*height*depth;
    }
    boolean checkEquality(Box b2)
   {
       if(b2.getWidth() == this.width &&  b2.getDepth() == this.depth  && b2.getHeight() == this.height)
       {
           return true;
        }
        return false;
    }

    Box createNewBox(double wOffSet,double doffSet, double hoffset){
        Box newBox = new Box(width + wOffSet,depth + doffSet , height + hoffset);
        return newBox;
    }

}
