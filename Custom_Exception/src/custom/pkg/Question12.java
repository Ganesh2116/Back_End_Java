package custom.pkg;
//Define a MinBalanceException for a bank account, ensuring the balance never goes below ₹1000.

class  MinBalanceException extends  Exception
{
	 MinBalanceException(String message)
	 {
		 super(message);
	 }
}

public class Question12 {
	
	public static void checkBalance(int bal) throws  MinBalanceException
	{
		if (bal < 1000)
		{
			throw new  MinBalanceException("balance below ₹1000");
		}
		else
		{
			System.out.println("Balance is :"+bal);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkBalance(500);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
