package custom.pkg;

import java.util.Arrays;

//Write a program that throws an InvalidPhoneNumberException if the phone number has less than 10 digits.

class InvalidPhoneNumberException extends Exception
{
	InvalidPhoneNumberException(String message)
	{
		super(message);
	}
}

public class Question14 {
	
	public static void checkPhoneNumber(long num) throws InvalidPhoneNumberException
	{
		String str = String.valueOf(num);
		if (str.length() >= 10)
		{
			throw new InvalidPhoneNumberException("Enter the phone number has less than 10 digits");
		}
		else
		{
			System.out.println("Phone number is :"+num);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkPhoneNumber(72489844721L);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
