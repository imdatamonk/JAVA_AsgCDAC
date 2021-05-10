/*
Display food menu to user. Assign fixed prices to food items.
User will select items from menu along with the quantity. 
(eg 1. Dosa 2. Samosa 3. Rice 4. Noodles .......10 . Generate Bill ) 
When user chooses 'Generate Bill' option, display total bill & exit.
Hint : Use scanner for user interactionpublic   */

import java.util.Scanner;
class FoodMenu 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int orderno = 0;
        double bill = 0;
        int nc = 0;
        while(orderno != 10)
        {
            System.out.println("Enter No to Select Your Order's:\nItem \tPrice \n1. Dosa \t25Rs \n2. Idli \t30Rs \n3. Sambarwada  \t35Rs \n4. Samosa \t20Rs \n5. Kachori \t25Rs \n6. Wada  \t10Rs \n7. Rice \t50 \n8. Roti \t10Rs/Each \n9. Sabji \t40Rs \n10. Generate Bill");
            System.out.println("\nHow much you want:\t");
            nc = sc.nextInt();
            orderno = sc.nextInt();
            //double price;
            switch(orderno)
            {
                case 1:
                    bill = (bill + (25*nc));
                    System.out.println("\n Thank You !! Do you want to Add more or Genrate Bill\n\n");
                    break;

                case 2:
                    bill = (bill + (30*nc));
                    System.out.println("\n Thank You !! Do you want to Add more or Genrate Bill\n\n");
                    break;

                case 3:
                    bill = (bill + (35*nc));
                    System.out.println("\n Thank You !! Do you want to Add more or Genrate Bill\n");
                    break;

                case 4:
                    bill = (bill + (20*nc));
                    System.out.println("\n Thank You !! Do you want to Add more or Genrate Bill\n\n");
                    break;

                case 5:
                    bill = (bill + (25*nc));
                    System.out.println("\n Thank You !! Do you want to Add more or Genrate Bill\n\n");
                    break;

                case 6:
                    bill = (bill + (10*nc));
                    System.out.println("\n Thank You !! Do you want to Add more or Genrate Bill\n\n");
                    break;

                case 7:
                    bill = (bill + (50*nc));
                    System.out.println("\n Thank You !! Do you want to Add more or Genrate Bill\n\n");
                    break;

                case 8:
                    bill = (bill + (10*nc));
                    System.out.println("\nThank You !! Do you want to Add more or Genrate Bill\n\n");
                    break;

                case 9:
                    bill = (bill + (40*nc));
                    System.out.println("\nThank You !! Do you want to Add more or Genrate Bill\n\n");
                    break;

                case 10:
                    System.out.println("\n\nYour total Bill is:\t" + bill);
                    break;
                
                default:
                    System.out.println("\nEnter valid number\n");
                    break;
            }
        }    
        sc.close();
    }    
}
