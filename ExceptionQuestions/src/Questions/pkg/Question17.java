package Questions.pkg;

//Create a custom exception InsufficientBalanceException and use it in a banking system to prevent overdrafts.

class InsufficientBalanceException extends Exception
{
	InsufficientBalanceException(String message)
	{
		super();
	}
}

public class Question17 {
	
	static void display(int amu,int bal) throws InsufficientBalanceException
	{
		if (amu >bal)
		{
			throw new InsufficientBalanceException("Insufficient balance");
		}
		else
		{
			System.out.println("balance is:"+bal);
		}
	}
	
	public static void main(String[] args) {
		try {
			display(500,300);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
