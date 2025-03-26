package Questions.pkg;

//19. Define an InvalidPasswordException and use it to validate a user’s password.  

class InvalidPasswordException extends Exception
{
	InvalidPasswordException(String message)
	{
		super(message);
	}
}

public class Question19 {
	static void display(String pass)throws InvalidPasswordException
	{
		if (pass.length() >8)
		{
			throw new InvalidPasswordException("enter above 8 char");
		}
		else
		{
			System.out.println("Password is :"+pass);
		}
	}
	public static void main(String[] args) {
		try {
			display("bharti@38u9");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
