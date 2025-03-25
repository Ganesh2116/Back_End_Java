package custom.pkg;

//Create a DivisionByZeroException and throw it when a number is divided by zero.

class DivisionByZeroException extends Exception
{
	DivisionByZeroException(String message)
	{
		super(message);
	}
}

public class Question04 {
	static public void checkDiv(int num,int div) throws DivisionByZeroException
	{
		if (div == 0)
		{
			throw new DivisionByZeroException("zero divided any number division is zero ");
		}
		else
		{
			System.out.println("divided is  :"+num);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkDiv(15,0);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}