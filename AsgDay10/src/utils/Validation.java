package utils;

import static org.app.Customer.sdf;

import java.text.ParseException;
import java.util.Date;
import custom_exception.InvalidInputException;
import enums.CustomerType;

/*2.3 
Add I/P Validation rules in utils package : ValidationRules.java 
Add them using different public static methods(eg : validateEmail, validatePassword etc)
Must use exception delegation (throws)

1.Customer email must contain "@"  &  email  should end with ".com" (Use String class methods
contains , endsWith methods)
eg : public static String validateEmail(String email) throws InvalidInputException{...}

2. customer type must be either SILVER or GOLD or PLATUNUM (Hint :  String class contains method)

3. Reg amount must be in multiples of 500.(Hint : % operator)

In case of validation failures , throw your custom exception , which will be actually handled in catch-all block of main method  of Tester class.
i.e Centralized exception handling is expected.*/

public class Validation {
	public static String validateEmail(String email) throws InvalidInputException{
		if(!(email.contains("@") && email.endsWith(".com")))
			throw new InvalidInputException("Enter Valid Email Adress");
		return email;

	}
	public static CustomerType validateCustomer(String custType) throws InvalidInputException{
		try {
			return CustomerType.valueOf(custType.toUpperCase());
		}catch(Exception e){
			throw new InvalidInputException("Invalid  Customer Type");
		}
	}
	public static String validatePassword(String password)throws InvalidInputException{
		if(password.length()<8)
		{
			throw new InvalidInputException("Password is too Short Size Must be Eight Keys");
		}
		return password;
	}
	public static double validateRegAmount(double regAmount) throws InvalidInputException{
		if(regAmount % 500 != 0) {
			throw new InvalidInputException("Reg amount must be in multiples of 500");
		}
		return regAmount;
	}
	public static Date validateDate(String registrationDate) throws InvalidInputException,ParseException{
		Date curntDate=new Date();
		if(!(curntDate.after(sdf.parse(registrationDate)))) {
			throw new InvalidInputException("Date Format Mix-Match...");
		}
		return sdf.parse(registrationDate);
	}


}
