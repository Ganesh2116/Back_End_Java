package custom.pkg;

//3. Define a LowMarksException that gets thrown if a student's marks are below 40.  

class LowMarksException extends Exception
{
	LowMarksException(String message)
	{
		super(message);
	}
}

public class Question03 {
	static public void checkMarkes(int num) throws LowMarksException
	{
		if (num <40)
		{
			throw new LowMarksException("Markes is below 40");
		}
		else
		{
			System.out.println("markes is :"+num);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkMarkes(35);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}