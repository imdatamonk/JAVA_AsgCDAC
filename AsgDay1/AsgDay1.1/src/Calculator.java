/*Write The java program should run till user enters "quit" or any other option than add or sub or mult or div.
Prompt user to enter the input operation : (add|sub|mult|div) & 2 numbers(double)
Display the result of the operation.
Hint : Use Scanner for accepting all inputs from user. */
import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opr = 0;        
		while (opr != 5) {
            System.out.println("Select Operation You want to do: \n1. Add \n2. Sub \n3. Mult \n4. Div \n5. Quit \t ");
            opr = sc.nextInt();
			double num1;
			double num2;
            switch (opr) {
                case 1:
					System.out.println("Enter Value of num1: \t");
            		num1 = sc.nextDouble();
					System.out.println("Enter Value of num2: \t"); 
					num2 = sc.nextDouble();
                    System.out.println("Addition is:\t" + (num1 + num2));
                    break;
                case 2:
					System.out.println("Enter Value of num1: \t");
					num1 = sc.nextDouble();
					System.out.println("Enter Value of num2: \t"); 
					num2 = sc.nextDouble();
                    System.out.println("Substraction is:\t " + (num1 - num2));
                    break;
                case 3:
					System.out.println("Enter Value of num1: \t");
            		num1 = sc.nextDouble(); 
					System.out.println("Enter Value of num2: \t");
					num2 = sc.nextDouble();
                    System.out.println("Multiplication is: \t " + (num1 * num2));
                    break;
                case 4:
					System.out.println("Enter Value of num1: \t");
					num1 = sc.nextDouble(); 
					System.out.println("Enter Value of num2: \t");
					num2 = sc.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Can not divided by Zero");
                    } else {
                        System.out.println("Division is: \t "+(num1/num2));
                    }
                    break;
                case 5:
                    System.out.println("Quit");
                    break;

                default:
                    System.out.println("Enter valid number");
                    break;
            }
        }
    }
}