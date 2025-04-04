package custom.pkg;
//Define an ExceedWeightLimitException for an elevator system when the weight limit is exceeded.

class ExceedWeightLimitException extends Exception
{
	ExceedWeightLimitException(String message)
	{
		super(message);
	}
}
public class Question17 {
	
	public static void elevatorCheckWeight(int pel,int avgWeg) throws ExceedWeightLimitException
	{
		int avg = pel * avgWeg;
		if (avg > 400)
		{
			throw new ExceedWeightLimitException("weight limit is exceeded");
		}
		else
		{
			System.out.println("Enter meanu number in elevator ");
		}
	}
	
	public static void main(String[] args) {
		try {
			elevatorCheckWeight(8, 80);
		} catch (Exception e) {
			System.out.println(e);		}
	}

}
