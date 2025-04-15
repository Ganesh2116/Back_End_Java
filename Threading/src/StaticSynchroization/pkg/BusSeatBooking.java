package StaticSynchroization.pkg;

class Booking 
{
	static int tseats = 20;
	
	public static synchronized void display(int seats)
	{
		if (tseats >= seats)
		{
			tseats -= seats;
			System.out.println("Seats successfully booked \n available seats is "+tseats);
			
		}
		else
		{
			System.out.println("Seats not available available seats are : "+tseats);
		}
	}
}


class Thread01 extends Thread
{
	static Booking bo;
	int seats;
	
	public Thread01(Booking bo,int seats)
	{
		this.bo = bo;
		this.seats = seats;
	}
	
	public void run()
	{
		bo.display(seats);
	}
}


class Thread02 extends Thread
{
	static Booking bo;
	int seats;
	
	public Thread02(Booking bo,int seats)
	{
		this.bo = bo;
		this.seats = seats;
	}
	
	public void run()
	{
		bo.display(seats);
	}
}



public class BusSeatBooking {
	public static void main(String[] args) {
		
		Booking obj = new Booking();
		
		Thread01 ob1 = new Thread01(obj, 5);
		Thread01 ob2 = new Thread01(obj, 5);
		ob1.start();
		ob2.start();
		
		Booking obj1 = new Booking();
		
		Thread02 ob = new Thread02(obj, 1);
		Thread02 ob01 = new Thread02(obj, 5);
		ob.start();
		ob01.start();
	}
	

}
