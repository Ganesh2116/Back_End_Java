package DaemonThread.pkg;
//Write a program where a daemon thread runs in the background while the main thread performs a task.

class DemoThread extends Thread
{
	public void run()
	{
		System.out.println("Daemon thread working..");
	}
}

public class Question03 {
	
	public static void main(String[] args) {
		DemoThread obj = new DemoThread();
		obj.setDaemon(true);
		obj.start();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("working"+i+"...");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
