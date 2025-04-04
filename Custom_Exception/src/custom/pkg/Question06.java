package custom.pkg;
//Write a program that throws an InvalidPasswordException when the password length is less than 8.

class InvalidPasswordException extends Exception
{
	InvalidPasswordException(String message)
	{
		super(message);
	}
}
public class Question06 {
	
	public static void passwordCheck(String password) throws InvalidPasswordException
	{
		if (password.length() > 8)
		{
			throw new InvalidPasswordException("Enter the password less than 8 char");
		}
		else
		{
			System.out.println("Password is:"+password);
		}
	}

	public static void main(String[] args) {
		try {
			passwordCheck("ganeshbharti@456");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
