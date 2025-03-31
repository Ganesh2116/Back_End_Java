package Questions;

//6)Write a program that defines a custom exception NegativeNumberException and throws it if the user enters a negative number.


class NegativeNumberException extends Exception
{
	NegativeNumberException(String message)
	{
		super(message);
	}
}
public class Question06 {
	
	public static void checkValue(int num) throws NegativeNumberException
	{
		if ( num < 0)
		{
			throw new NegativeNumberException("values is negative");
		}
		else
		{
			System.out.println("values is :"+num);
		}
	}
	public static void main(String[] args) {
		try {
			checkValue(-100);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
