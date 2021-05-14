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
 * 
 * 
 * 4.New option
Update Emp Salary
Input : emp id & increment
If it's a manager , this increment is for performance bonus. If it's a worker this is an increment in hourly rate. So update suitably (Hint : instanceof & add suitable methods in classes)
Display updated computed salary of the employee.
*/
public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the no of Employee you want to Hire");
		Emplpoyee[] emp = new Emplpoyee[sc.nextInt()];
		boolean exit = false;
		int np = 0;
		while(!exit) {
			System.out.println("\nMenu \n1. Hire Manager \n2. Hire Worker \n3. Display Information \n4. Update Employee Salary \n10. Exit\n");
			switch (sc.nextInt()) {
			case 1:
				if (np < emp.length) {
					System.out.println("\nEnter Details  \nDeptId  \nName  \nBasic Salary  \nPerformance Bounus\n");
					emp[np++] = new Manager(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextDouble());
				} else
					System.out.println("Registration full");				
				break;			
			case 2:
				if (np < emp.length) {
					System.out.println("\nEnter Details  \nDeptId  \nName  \nBasic Salary  \nNum of Hours Worked \nRate per Hour\n");
					emp[np++] = new Worker(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextInt());
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
				
			case 4:
				System.out.println("Enter Employee id:\t");
				int e_id = sc.nextInt();
				for(Emplpoyee emps : emp)
				{
					if(emps instanceof Manager) {
						if(((Manager)emps).getId()==e_id) {
							System.out.println("Enter Updated Performance Bonus:\t");
							double updateB = sc.nextDouble();
							((Manager)emps).setPerfomanceBonus(((Manager)emps).getPerfomanceBonus()+updateB);
							System.out.println("Updated Net Salary of" + " " + emps.getName() + " " + "is:\t" + emps.computeNetSalary() + "\n\n");
							break;
						}
					}
					else if(emps instanceof Worker) {
						if(((Worker)emps).getId()==e_id) {
							System.out.println("Enter Updated Houtly Rate:\t");
							int HrsU = sc.nextInt();
							((Worker)emps).setHourlyRate(((Worker)emps).getHourlyRate()+HrsU);
							System.out.println("Updated Net Salary of" + " " + emps.getName() + " " + "is:\t" + emps.computeNetSalary() + "\n\n");
							break;						
					}
	
				}
					else {
						System.out.println("Please Employee Proper ID");
					}
				
				}		
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
