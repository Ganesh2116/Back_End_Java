package DaemonThread.pkg;

//Create a daemon thread that prints numbers from 1 to 5 in an infinite loop while the main thread sleeps.  


class DaemonThread extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class Question04 {
	
	public static void main(String[] args) {
		DaemonThread obj = new DaemonThread();
		obj.setDaemon(true);
		obj.start();
		
		 try {
	            System.out.println("sleeping for 6 seconds...");
	            Thread.sleep(6000); 
	        } catch (InterruptedException e) {
	            System.out.println("Main thread interrupted.");
	        }
	}

}
