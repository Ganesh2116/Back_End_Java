package custom.pkg;
//Define an InvalidDateException and throw it if a user enters a date like 31st February

class InvalidDateException extends Exception
{
	InvalidDateException(String message)
	{
		super(message);
	}
}

public class Question21 {
	
	public static void checkFebDate(int date) throws InvalidDateException
	{
		if (date >= 29)
		{
			throw new InvalidDateException("Enter date invalid date");
		}
		else
		{
			System.out.println("february date is:"+date);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkFebDate(32);
		} catch (InvalidDateException e) {
			System.out.println(e);
		}
	}

}
