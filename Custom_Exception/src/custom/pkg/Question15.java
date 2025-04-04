package custom.pkg;
//Create an InsufficientFuelException if a vehicle’s fuel is below 5 liters before a long journey.

class InsufficientFuelException extends Exception
{
	InsufficientFuelException(String message)
	{
		super(message);
	}
}

public class Question15 {
	
	public static void checkFuel(int fuel) throws InsufficientFuelException
	{
		if (fuel < 5)
		{
			throw new InsufficientFuelException("vehicle’s fuel is below 5 liters before a long journey");
		}
		else
		{
			System.out.println("Fule is :"+fuel);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkFuel(3);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
