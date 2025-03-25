package custom.pkg;
//Write a program that throws a NegativeDepositException if a negative amount is deposited.

class NegativeDepositException extends Exception
{
	NegativeDepositException(String message)
	{
		super(message);
	}
}

public class Question18 {
	
	public static void checkDeposit(int dep) throws NegativeDepositException
	{
		if (dep <0)
		{
			throw new NegativeDepositException("Donot not enter the negative amount");
		}
		else
		{
			System.out.println("Your amount is deposited ");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkDeposit(-500);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
