package custom.pkg;
//Implement an InvalidWithdrawalException when a person tries to withdraw more than their balance.

class InvalidWithdrawalException extends Exception
{
	InvalidWithdrawalException(String message)
	{
		super(message);
	}
}

public class Question20 {
	
	public static void checkWithdrawal(int WithdrawalAmount,int balace) throws InvalidWithdrawalException
	{
		if (balace < WithdrawalAmount)
		{
			throw new InvalidWithdrawalException("withdraw more than their balance");
		}
		else
		{
			System.out.println("withdrawal amount is :"+WithdrawalAmount);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkWithdrawal(500, 200);
		} catch (InvalidWithdrawalException e) {
			System.out.println(e);
		}
	}

}
