package Synchronization.pkg;

//Create a class with a synchronized method that prints "Thread is running" five times.

class RunningThread extends Thread
{
	public synchronized void run()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println("Thread is running");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class Question07 {
	
	public static void main(String[] args) {
		RunningThread obj = new RunningThread();
		obj.start();
	}

}
