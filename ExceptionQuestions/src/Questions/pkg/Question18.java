package Questions.pkg;
//Write a Java program that throws a custom NegativeNumberException when a negative number is entered.

class NegativeNumberException extends Exception
{
	NegativeNumberException(String message)
	{
		super();
	}
}

public class Question18 {
	
	static void display(int num) throws NegativeNumberException
	{
		if (num <0)
		{
			throw new NegativeNumberException("number is nagative ");
		}
		else
		{
			System.out.println("number is "+num);
		}
	}
	
	public static void main(String[] args) {
	try {
		display(-10);
	} catch (NegativeNumberException e) {
		System.out.println(e);
	}	
	}

}
