package Synchronization.pkg;
//8. Write a synchronized method that prints even numbers from 2 to 10.  

class EvenPrint extends Thread
{
	public synchronized void run()
	{
		System.out.println("Even Numbers");
		for (int i=1;i<=10;i++)
		{
			if ( i%2 == 0)
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
}
public class Question08 {
	public static void main(String[] args) {
		EvenPrint obj = new EvenPrint();
		obj.start();
		
	}

}
