package custom.pkg;
//Create a TemperatureOutOfRangeException and throw it if the temperature exceeds 50°C or drops below -10°C.

class TemperatureOutOfRangeException extends Exception
{
	TemperatureOutOfRangeException(String message)
	{
		super(message);
	}
}

public class Question11 {
	
	public static void checkTemp(int temp) throws TemperatureOutOfRangeException
	{
		if (50 > temp && temp < -10)
		{
			throw new TemperatureOutOfRangeException("the temperature exceeds 50°C or drops below -10°C.");
		}
		else
		{
			System.out.println("Tempture is :"+temp);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkTemp(-11);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
