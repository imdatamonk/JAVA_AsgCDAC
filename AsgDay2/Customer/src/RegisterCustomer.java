import java.util.Scanner;

public class RegisterCustomer{
    public static void main(String[] args) {
        Customer c = new Customer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details of Custmer:\n\nEnter Name:\t");
        c.setName(sc.nextLine());
        System.out.println("Enter email_id:\t");
        c.setEmail_id(sc.nextLine());
        System.out.println("Enter Age:\t");
        int age = sc.nextInt();
        if((age >= 21) && (age <= 61))
        {
            c.setAge(age);
            System.out.println("Enter CreditLimit:\t");
            double creditL = sc.nextDouble();
            if((creditL >= 5000) && (creditL <= 50000))
            {
                c.setCreditLimit(creditL);
                
            }
            else
            {
                System.out.println("Please enter value in credit limit");

            }
        }
        else
        {
            System.out.println("Age limit not followed");
        }
        System.out.println("\nCustomer Name is:\t" + c.getName()  + "\nEmail id is:\t" + c.getEmail_id() + "\nAge of customer:\t" + c.getAge() +"\nCreditLimit is:\t" + c.getCreditLimit());
        sc.close();
    }
}