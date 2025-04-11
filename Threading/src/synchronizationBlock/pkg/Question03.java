package synchronizationBlock.pkg;
//Implement a class where two threads try to update a shared variable using a synchronized block.

class CounterShared 
{
	public void print()
	{
		synchronized (this) {
			System.out.println("Counter:");
			for (int i=1;i<=5;i++)
			{
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			
		}
	}
}
public class Question03 implements Runnable
{
	static CounterShared obj = new CounterShared();
	
	public void run()
	{
		obj.print();
	}

	public static void main(String[] args) {
		Question03 obj = new Question03();
		Thread ob = new Thread(obj);
		ob.start();
		
		Question03 obj1 = new Question03();
		Thread ob1 = new Thread(obj1);
		ob1.start();
	}
	
}
