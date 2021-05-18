package com.app.tester;

import java.util.ArrayList;
import java.util.Scanner;
import org.app.Customer;
import custom_exception.CustomerHandlingException;
import enums.CustType;
import static utils.ValidationRules.*;

public class Tester{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			ArrayList<Customer> custArr = new ArrayList<>();
			Customer cst = null;
			int pos;
			String name, email, password;
			double amount;
			CustType ct;
			int choice;
			boolean trip = true;
			while (trip) {
				System.out.println("Welcome to ABC application");
				System.out.println("1.Register\n2.Login\n3.Change Password\n4.Un-Subscribe Email");
				int cas1 = sc.nextInt();
				if (cas1 == 3)
					choice = 2;
				else
					choice = cas1;

				switch (choice) {
				case 1:
					System.out.println("Enter the details of customer");
					System.out.println("Enter the name");
					name = sc.next();

					while (true) {
						try {
							System.out.println("Enter the email");
							email = sc.next();
							validateEmail(email);
							break;
						} catch (CustomerHandlingException e) {
							System.out.println(e);
							System.out.println("Please re-enter the details");
						}
					}
					while (true) {
						try {
							System.out.println("Enter the password");
							password = sc.next();
							validatePassword(password);
							break;
						} catch (CustomerHandlingException e) {
							System.out.println(e);
							System.out.println("Please re-enter the details");
						}
					}
					while (true) {
						System.out.println("Enter the customer type");
						try {
							ct = CustType.valueOf(sc.next().toUpperCase());
							break;
						} catch (IllegalArgumentException e) {
							System.out.println("Please check the details, customer types are SILVER,GOLD,PLATINUM");
						}
					}

					while (true) {
						try {
							System.out.println("Enter the reg amount");
							amount = sc.nextDouble();
							validateReg(amount, ct);
							break;
						} catch (CustomerHandlingException e) {
							System.out.println(e);
							System.out.println("Please re-enter the details");
						}
					}
					custArr.add(new Customer(name, email, password, ct.name(), amount));
					break;

				case 2:
					int tries = 3;
					outer: while (true) {

						System.out.println("Enter the login details");
						System.out.println("Please enter the email ID");
						email = sc.next();
						cst = new Customer(email);
						pos = custArr.indexOf(cst); //change

						if (pos != -1) {
							while (tries > 0) {
								cst = custArr.get(pos);
								System.out.println("Enter Password");
								if (sc.next().equals(cst.getPassword())) {
									System.out.println("Login Successful");
									break outer;
								} else {
									System.out.println("Wrong password. Please try again!!!!");
									tries--;
								}
							}
						}
						if (tries == 0) {
							System.out.println("Maximum attempts reached");
							break outer;
						}
						else {
							System.out.println("Invalid Login mail");
						}
					}
					if (cas1 != 3)
						break;

				case 3: 
					System.out.println("Enter New password ");
					cst.setPassword(sc.next());
					System.out.println("Password Changed!!!");
					break;

				case 4:
					System.out.println("Please enter the email ID");
					email = sc.next();
					pos = custArr.indexOf(new Customer(email));
					if (pos != -1) {
						cst = custArr.remove(pos);
						System.out.println("You have successfully Unsubscribed ");
					}
					break;

				default:
					break;
				}
			}
		}
	}
}