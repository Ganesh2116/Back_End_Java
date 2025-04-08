package DaemonThread.pkg;

//Create a daemon thread that prints "Hello from Daemon Thread" continuously until the main thread sleeps for 2 seconds.

class DaemonThre extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("Hello from Daemon Thread");
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class Question07 {

	public static void main(String[] args) {
		
		DaemonThre obj = new DaemonThre();
		obj.setDaemon(true);
		obj.start();
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Main Thread");
	}
}
