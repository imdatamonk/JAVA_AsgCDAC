package org.app;
import java.text.SimpleDateFormat;
import java.util.Date;

import enums.CustomerType;

/*2.Create a customer management application along with validations. 
2.1 Customer class
state --name,email,password,custType(String),reg amount(double)
Add constructor n toString.*/

public class Customer {
	private String name,email,password;
	private CustomerType custType;
	private double reg_amount;
	private Date registrationDate;
	private static SimpleDateFormat sdf;

	static {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}

	public Customer(String name, String email, String password, CustomerType custType, double reg_amount, Date registraDate) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.custType = custType;
		this.reg_amount = reg_amount;
		this.registrationDate = registraDate;
	}

	@Override
	public String toString() {
		return "\n\nName:\t" + name + "\nEmail_id:\t" + email + "\nPassword:\t" + password + "\nCustType:\t" + custType + "\nRegistration_Amount:\t" + reg_amount + "\nRegistration Date:\t" 
				+ sdf.format(registrationDate);
	}

}
