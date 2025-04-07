package SleepMethod.pkg;

class DemoThread extends Thread
{
	public void display() throws InterruptedException
	{
		System.out.println("The thread has Started ..");
		for (int i=1;i<=5;i++)
		{
			Thread.sleep(2000);
			System.out.println(i);
		}
	}
	
	public void run()
	{
		try {
			display();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class SleepMethodDemo {
	public static void main(String[] args) {
		DemoThread obj = new DemoThread();
		obj.start();
	}

}
