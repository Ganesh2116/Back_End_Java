package custom.pkg;
//Implement a SeatFullException in a ticket booking system when no more seats are available.

class SeatFullException extends Exception
{
	SeatFullException(String message)
	{
		super(message);
	}
}
public class Question13 {
	public static void checkSeat(int seat) throws SeatFullException
	{
		if (seat >100)
		{
			throw new SeatFullException("seat no more available");
		}
		else
		{
			System.out.println("seat available is:"+(100-seat));
		}
	}
	
	public static void main(String[] args) {
		try {
			checkSeat(110);
		} catch (Exception e) {
		System.out.println(e);
		}
	}

}
