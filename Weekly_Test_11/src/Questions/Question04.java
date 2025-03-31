package Questions;

//4)Create a custom exception InvalidAgeException and write a program that throws this exception if age is less than 18.

class InvalidAgeException extends Exception
{
	InvalidAgeException(String message)
	{
		super(message);
	}
}

public class Question04 {
	
	 static void ageCheck(int age) throws InvalidAgeException
	 {
		if (age< 18)
		{
			throw new InvalidAgeException("Age is less than 18");
		}
		else
		{
			System.out.println("Vaild age..");
		}
	 }
	
	public static void main(String[] args) {
		try {
			ageCheck(-15);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}
		
	}

}
