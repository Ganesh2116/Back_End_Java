package Synchronization.pkg;

class Shared 
{
	public synchronized void display()
	{
		for (int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class DemoSynchro extends Thread
{
	static Shared be;
	
	public void run()
	{
		be.display();
	}
	
	public static void main(String[] args) {
			
		be = new Shared();
		DemoSynchro obj = new DemoSynchro();
		DemoSynchro obj1 = new DemoSynchro();
		DemoSynchro obj2 = new DemoSynchro();
		obj.start();
		obj1.start();
		obj2.start();
		
	}

}
