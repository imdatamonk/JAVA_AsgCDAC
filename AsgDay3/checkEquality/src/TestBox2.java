import java.util.Scanner;

class TestBox2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Box1 dims w d h:\t");
        Box b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Dimension of Box are:\t" + b1.getBoxDimensions());

        System.out.println("\nEnter Box2 dims w d h:\t");
        Box b2 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Dimension of Box are:\t" + b2.getBoxDimensions());

        System.out.println((b2.checkEquality(b1)? "Same" : "Different"));
   
        System.out.println("\nEnter Edge of cube:\t");
        Box b3 = new Box(sc.nextDouble());
        System.out.println("Volume of Cube is :\t" + b3.computeBoxVolume());
 
        Box b4 =  b1.createNewBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Dimension of Box are:\t" + b4.getBoxDimensions());
        sc.close();

    }
}