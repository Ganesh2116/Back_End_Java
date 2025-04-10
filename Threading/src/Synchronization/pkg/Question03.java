package Synchronization.pkg;

//3. Implement a synchronized method that prints numbers from 1 to 5.  

class My1Thread implements Runnable
{
	public synchronized void run() 
	{
		for (int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}

public class Question03 {
	
	public static void main(String[] args) {
		My1Thread obj = new My1Thread();
		Thread ob = new Thread(obj);
		
		ob.start();
	}

}
