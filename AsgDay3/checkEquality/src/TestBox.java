
import java.util.Scanner;

class TestBox {
    public static void main(String[] args) {
        int data;// primitive type : method local variable : mem allocated on stack
        data = 100;
        // create a scanner object attached to stdin : System.in
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Box dims w d h");
        Box box1;// class type of ref. : method local variable : mem allocated on stack
        box1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        // display box dims
        System.out.println(box1.getBoxDimensions());
        // display computed volume
        System.out.println("Computed volume :" + box1.computeBoxVolume());
        Box box2 = new Box(1, 2, 3);
        // display box dims
        System.out.println(box2.getBoxDimensions());
        // display computed volume
        System.out.println("Computed volume :" + box2.computeBoxVolume());
        Box box3 = box1; // copy of references
        // display box dims
        System.out.println(box3.getBoxDimensions());
        // display computed volume
        System.out.println("Computed volume :" + box3.computeBoxVolume());

        box1 = null;// de linking (are there any objects marked for garbage collection?)no/0
        
        // System.out.println(box1.getBoxDimensions());what will happen if you uncomment > -->> will print 0.0
        // this line?
        System.out.println(box3.getBoxDimensions());// what will happen here ? ---->  //will display computed volume of box3
        
        box3 = null;
        // are there any objects marked for garbage collection? How many ? yes.. 2
        box2 = null;
        // are there any objects marked for garbage collection? How many ? yes .. 2
        sc.close();
    }
}