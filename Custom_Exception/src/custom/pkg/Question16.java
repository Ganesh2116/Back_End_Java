package custom.pkg;
//Implement an InvalidAgeException to check the eligibility for a driving license.

class InvalidAgeException extends Exception
{
	InvalidAgeException(String message)
	{
		super(message);
	}
}

public class Question16 {
	
	public static void checkEligDrivingLicense(int age) throws InvalidAgeException
	{
		if (age < 18)
		{
			throw new InvalidAgeException("your not eligibility for a driving license");
		}
		else
		{
			System.out.println("Eligibility for a driving license");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkEligDrivingLicense(15);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
