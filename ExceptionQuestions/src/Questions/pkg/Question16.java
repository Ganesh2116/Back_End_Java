package Questions.pkg;
//Define a custom exception InvalidAgeException and use it in a program to check if a user is eligible for a job.

class InvalidAgeException extends Exception
{
	InvalidAgeException(String message)
	{
		super(message);
	}
}

public class Question16 {
	
	static void display(int age) throws InvalidAgeException
	{
		if (age <21)
		{
			throw new InvalidAgeException("invalid age ");
		}
		else
		{
			System.out.println("eligible for ag job");
		}
	}

	public static void main(String[] args) {
		try {
			display(18);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
