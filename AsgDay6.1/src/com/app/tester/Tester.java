package com.app.tester;
import com.app.org.*;
import java.util.Scanner;
/*
 * 4. Write CreateOrganization in "tester" package.
Create suitable array to store organization details.
Provide following options
1. Hire Manager
2. Hire Worker  
3. Display information of all employees(using toString) including net salary(by invoking computeNetSalary)  using single for-each loop.
10. Exit
NOTE : Boundary condition checking & null checking is mandatory.
 * */
public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the no of Employee you want to Hire");
		Emplpoyee[] emp = new Emplpoyee[sc.nextInt()];
		boolean exit = false;
		int np = 0;
		while(!exit) {
			System.out.println("\nMenu \n1. Hire Manager \n2. Hire Worker \n3. Display Information \n10. Exit\n");
			switch (sc.nextInt()) {
			case 1:
				if (np < emp.length) {
					System.out.println("\nEnter Details  \nID  \nDeptId  \nName  \nBasic Salary  \nPerformance Bounus\n");
					emp[np++] = new Manager(sc.nextInt(),sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextDouble());
				} else
					System.out.println("Registration full");				
				break;			
			case 2:
				if (np < emp.length) {
					System.out.println("\nEnter Details  \nID  \nDeptId  \nName  \nBasic Salary  \nNum of Hours Worked \nRate per Hour\n");
					emp[np++] = new Worker(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextInt());
							} else
					System.out.println("Registration full");				
				break;				
			case 3:
				for(Emplpoyee e : emp) 
					if(e!= null ) {
						System.out.println(e);
						System.out.println("Net Salary of" + " " + e.getName() + " " + "is:\t" + e.computeNetSalary() + "\n\n");
					}
				break;			
			case 10:
				exit = true;				
				break;
			default:
				System.out.println("\nEnter valid number\n");
				break;
			}			
		}		
		sc.close();
	}
}
