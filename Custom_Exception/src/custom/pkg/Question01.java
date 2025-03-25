package custom.pkg;

//Create a custom exception NegativeNumberException and throw it if the user enters a negative number.


class NegativeNumberException extends Exception
{
	NegativeNumberException(String message)
	{
		super(message);
	}
}

public class Question01 {
	static public void checkNum(int num) throws NegativeNumberException
	{
		if (num <0)
		{
			throw new NegativeNumberException("Number is negtive");
		}
		else
		{
			System.out.println("Number is :"+num);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkNum(-12);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
