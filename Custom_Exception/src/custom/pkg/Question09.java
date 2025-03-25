package custom.pkg;

// Define an InvalidEmailException that gets triggered when an email does not contain '@'.

class InvalidEmailException extends Exception
{
	InvalidEmailException(String message)
	{
		super(message);
	}
}

public class Question09 {
	
	public static void checkEmail(String mail) throws InvalidEmailException
	{
		if (mail.indexOf('@') == -1)
		{
			throw new InvalidEmailException("Your not puting mail Symbol");
		}
		else
		{
			System.out.println("Your mail is:"+mail);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkEmail("ganeshbharti728gmail.com");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
