package Synchromization.pkg;

//Write a synchronized method that increments a counter and prints its value

class Increment extends Thread
{
	public synchronized void run()
	{
		System.out.println("Counter");
		for(int i=0;i<=10;i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class Question02 {
	public static void main(String[] args) {
		Increment obj = new Increment();
		obj.start();
	}

}
