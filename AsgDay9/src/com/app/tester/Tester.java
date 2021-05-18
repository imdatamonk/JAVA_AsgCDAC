package com.app.tester;

import static utils.Validation.*;
import java.util.Scanner;
import org.app.Customer;
import custom_exception.InvalidInputException;

/*Tester
Create Customer array to store customer details.
Supply following options
1. Register new customer
Accept customer details : name,email,password,custType,reg amount
Invoke validation rules.
In case of errors , show error message(via catch block) & application should continue.
In case of no erros , display "Customer registration successful" message & store customer details. 
2. Display all customer details (for-each)
3. Exit*/

public class Tester extends Customer {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Number of Customers You want to Register");
			Customer[] customer = new Customer[sc.nextInt()];
			boolean exit = false;
			int np = 0;
			while(!exit) {
				System.out.println("\n\nDashboard \n1. Register New Customer \n2. Display Details of Customers \n3. Exit");
				switch(sc.nextInt()) {
				case 1:
					try {
						if (np < customer.length) {			
							System.out.println("Enter Customer Details\n");
							System.out.println("\nEnter Name:\t");
							String name= sc.next();
							System.out.println("\nEnte Email id:\t");
							String email = sc.next();
							validateEmail(email);
							System.out.println("\nEnter Password:\t");
							String password = sc.next();
							System.out.println("\nEnter Customer Type\n SILVER\t||\tGOLD\t||\tPLATUNUM\n");
							String custType = sc.next();
							validateCustomer(custType);
							System.out.println("\nEnter Registration Ammount:\t");
							double reg_amout = sc.nextDouble();
							validateRegAmount(reg_amout);	
							customer[np++] = new Customer(name,email,password,custType,reg_amout);
							break;
						}
						else {
							System.out.println("Registrain Full");
							break;
						}
					}
					catch(InvalidInputException e) {
						System.out.println(e.getMessage());
					}	

				case 2:
					for(Customer c : customer) 
						if(c != null) {
							System.out.println(c);
						}
					break;

				case 3:
					exit = true;				
					break;

				default:
					System.out.println("\nEnter valid number\n");
					break;			
				}			
			}	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("<----------------------------------------------------------Thank You---------------------------------------------------------->");

	}
}
