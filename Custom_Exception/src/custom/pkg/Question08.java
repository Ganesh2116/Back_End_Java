package custom.pkg;

// Implement a SpeedLimitExceededException that is thrown when vehicle speed exceeds 100 km/h.

class SpeedLimitExceededException extends Exception
{
	SpeedLimitExceededException(String message)
	{
		super(message);
	}
}

public class Question08 {
	public static void checkSpeed(int speed) throws SpeedLimitExceededException
	{
		if (speed > 100)
		{
			throw new SpeedLimitExceededException("speed limit is 100");
		}
		else
		{
			System.out.println("speed is :"+speed);
		}
	}
	public static void main(String[] args) {
		try {
			checkSpeed(120);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
