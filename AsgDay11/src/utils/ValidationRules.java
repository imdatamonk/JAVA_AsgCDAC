package utils;
import custom_exception.CustomerHandlingException;
import enums.CustType;

public class ValidationRules {
	private static String regexEmail = "[a-z0-9]+(@)[a-z]+(.com)";
	private static String regexPass = "/s";	
	
	public static void validateEmail(String mail) throws CustomerHandlingException{
		if (mail.matches(regexEmail)==false)
			throw new CustomerHandlingException("Invalid Email-Id, It must be in format abc@host.com" );
	}
	
	public static void validatePassword(String pass) throws CustomerHandlingException{
		if (pass.matches(regexPass)==true)
			throw new CustomerHandlingException("Invalid Password. Password must not contain whitespaces ");
	}
	
	public static void validateCustType(String custType) throws CustomerHandlingException{
		custType = custType.toUpperCase();
		System.out.println(custType);
		if (!custType.contains("SILVER") && !custType.contains("GOLD") && !custType.contains("PLATINUM"))
			throw new CustomerHandlingException("Invalid Customer type. It must be SILVER, GOLD , PLATINUM");
	}
	
	public static void validateReg(double regAmt , CustType ct) throws CustomerHandlingException{
		if(regAmt%500 != 0 || regAmt < ct.getMinBalance())
			throw new CustomerHandlingException("Invalid Reg Amount. It must be a multiple of 500"
					+ "\nThe minimum balance for "+ct.name() + " type is:" + ct.getMinBalance());
	}	
	
}