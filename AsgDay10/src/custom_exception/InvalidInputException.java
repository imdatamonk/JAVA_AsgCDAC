package custom_exception;

/*2.2 Create custom exception class(eg : CustomerHandlingException or InvalidInputException) , as a checked exception*/

@SuppressWarnings("serial")
public class InvalidInputException extends Exception{
	public InvalidInputException(String msg) {
		super(msg);
	}

}
