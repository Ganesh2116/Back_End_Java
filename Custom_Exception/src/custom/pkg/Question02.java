package custom.pkg;
//Write a program where a ZeroBalanceException is thrown when the account balance is zero.


class ZeroBalanceException extends Exception
{
	ZeroBalanceException(String message)
	{
		super(message);
	}
}

public class Question02 {
	static public void checkBalance(int bal) throws ZeroBalanceException
	{
		if (bal <0)
		{
			throw new ZeroBalanceException("Number is negtive");
		}
		else
		{
			System.out.println("balance is :"+bal);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkBalance(-12);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
