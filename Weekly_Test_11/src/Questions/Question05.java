package Questions;
//5)Implement a custom exception InsufficientBalanceException, which should be thrown when a withdrawal amount is greater than the account balance.

class InsufficientBalanceException extends Exception
{
	InsufficientBalanceException(String message)
	{
		super(message);
	}
}

public class Question05 {
	
	public static void withdrawalCheckBalance(int balance,int withdrawalAmu) throws InsufficientBalanceException
	{
		if ( balance < withdrawalAmu)
		{
			throw new InsufficientBalanceException("Insufficinet balance in account");
		}
		else
		{
			System.out.println("Withdrawal amount is:"+withdrawalAmu);
			System.out.println("Balance is:"+(balance-withdrawalAmu));
		}
	}
	
	public static void main(String[] args) {
		try {
			withdrawalCheckBalance(5000, 6000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
