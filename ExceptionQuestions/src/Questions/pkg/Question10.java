package Questions.pkg;
//Create a program that throws a custom exception when an invalid age (<18) is entered for voting eligibility.

class InvalidAgeNotEligibility extends Exception
{
	public InvalidAgeNotEligibility(String message) {
		super(message);
	}
}

public class Question10 {

	public static void display(int age) throws InvalidAgeNotEligibility
	{
		if (age<18)
		{
			throw new InvalidAgeNotEligibility("invalid age not eilgibilty here ");
		}
		else
		{
			System.out.println("Age is :"+age);
		}
	}

	public static void main(String[] args) {
		try {
			display(15);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
