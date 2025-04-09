package Synchromization.pkg;
//Create a class with a synchronized method that prints "Hello" five times
class Hello extends Thread
{
	public synchronized void run()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println("hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class Question01 {

	public static void main(String[] args) {
		Hello obj = new Hello();
		obj.start();
		
	}
}
