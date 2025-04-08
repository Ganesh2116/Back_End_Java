package DaemonThread.pkg;

// 6. Write a Java program where a non-daemon thread continues execution after the main thread exits.


class Thread01 extends Thread
{
	public void run()
	{
		System.out.println("Non daemon thread");
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class Question06 {
	public static void main(String[] args) {
		Thread01 obj = new Thread01();
		obj.start();
		
		System.out.println("main thread");
	}

}
