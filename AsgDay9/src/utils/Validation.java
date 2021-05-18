package utils;
import custom_exception.InvalidInputException;


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
	public static void validateEmail(String email) throws InvalidInputException{
		if(!((email.contains("@")) && (email.endsWith(".com")))){
			throw new InvalidInputException("Enter Valid Email Adress");
			}
		}
	
	public static void validateCustomer(String cust_type) throws InvalidInputException{
		if(!((cust_type.contains("SILVER")) || (cust_type.contains("GOLD")) || (cust_type.contains("PLATUNUM")))){
			throw new InvalidInputException("Invalid  Customer Type");
			}
		}
	
		
	public static void validateRegAmount(double regAmount) throws InvalidInputException{
		if(regAmount % 500 != 0) {
			throw new InvalidInputException("Reg amount must be in multiples of 500");
			}
		}
	
	/*
	 * public static validatePassWord(String PSWD)throws InvalidInputException{ if()
	 * { throw new
	 * InvalidInputException("Password Must be of or More than 8 words.. (a-z | 0-9 | Symbols"
	 * ) } }
	 */
	}
