package custom.pkg;

//Implement a TooYoungException that is thrown when a person's age is below 18 for voting.

class TooYoungException extends Exception
{
	TooYoungException(String message)
	{
		super(message);
	}
}

public class Question05 {
	
	static public void checkAge(int age) throws TooYoungException
	{
		if (age<18)
		{
			throw new TooYoungException("age shoulb be greater then 18");
		}
		else
		{
			System.out.println("vaild age for voting");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkAge(0);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
