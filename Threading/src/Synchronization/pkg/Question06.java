package Synchronization.pkg;

//Implement a synchronized method that multiplies two numbers and prints the result.

class Multiple implements Runnable
{
	public synchronized void run()
	{
		int num = 20;
		int num1 = 5;
		
		System.out.println("multilies of two numbers is :");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(num*num1);
	}
}

public class Question06 {
	
	public static void main(String[] args) {
		Multiple obj = new Multiple();
		Thread ob = new Thread(obj);
		ob.start();
	}

}
