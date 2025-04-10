package Synchronization.pkg;

//Implement a synchronized method that prints "Start", waits for 2 seconds, and then prints "End".

class StartEnd implements Runnable
{
	public synchronized void run()
	{
		System.out.println("Start");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("End");
	}
}

public class Question09 {
	public static void main(String[] args) {
		StartEnd obj = new StartEnd();
		Thread ob = new Thread(obj);
		ob.start();
		
	}

}
