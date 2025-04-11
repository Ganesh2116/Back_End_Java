package synchronizationBlock.pkg;


class Shared 
{
	public void print()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		
		
		synchronized (this)
		{
			for (int i=1;i<=5;i++)
			{
				System.out.println("some blocks"+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		
	}
}


public class SynchronizationBolckDemo extends Thread
{
	
	
		
		  static Shared b;
		   
		   public void run()
		   {    
		       b.print();
		   }
		   
		   public static void main(String[] args)
		   {
		       
		       b=new Shared();
		       SynchronizationBolckDemo th1 =new SynchronizationBolckDemo();
		       SynchronizationBolckDemo th2 =new SynchronizationBolckDemo();
		       SynchronizationBolckDemo th3 =new SynchronizationBolckDemo();
		       th1.start();
		       th2.start();
		       th3.start();
		       
		   }
		
	}


