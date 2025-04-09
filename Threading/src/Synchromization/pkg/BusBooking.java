package Synchromization.pkg;

import java.util.Scanner;

class Shared2 
{
	int seat = 50;
	public synchronized void display()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("available seats is "+this.seat);
		
		System.out.println("Enter how many seact you want to book ");
		int bookSeat = sc.nextInt();
		
		
		try {
			
			Thread.sleep(1000);
			if (bookSeat <= seat)
			{
				seat -= bookSeat;
				System.out.println("successfully booked");
			}
			else
			{
				System.out.println("seats are not available..");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class SeatBook extends Thread
{
	static Shared2 sh = new Shared2();
	public void run()
	{
		sh.display();
	}
}

public class BusBooking 
{
	public static void main(String[] args) {
		
		SeatBook obj = new SeatBook();
		SeatBook obj1 = new SeatBook();
		SeatBook obj2 = new SeatBook();
		obj.start();
		obj1.start();
		obj2.start();
	}

}
