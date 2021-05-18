package org.app;

/*2.Create a customer management application along with validations. 
2.1 Customer class
state --name,email,password,custType(String),reg amount(double)
Add constructor n toString.*/

public class Customer {
	private String name,email,password,custType;
	private double reg_amount;
	
	public Customer(){
		
	}
	public Customer(String name, String email, String password, String custType, double reg_amount) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.custType = custType;
		this.reg_amount = reg_amount;
	}

	public String toString() {
		return "\n\nName:\t" + name + "\nEmail_id:\t" + email + "\nPassword:\t" + password + "\nCustType:\t" + custType + "\nRegistration_Amount:\t" + reg_amount ;
		}
	
}
