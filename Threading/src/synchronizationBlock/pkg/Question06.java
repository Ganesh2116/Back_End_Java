package synchronizationBlock.pkg;

//Create a program where multiple threads access a shared list, ensuring synchronization using a synchronized block.

class SharedList 
{
	public void display()
	{
		System.out.println("Same block "+Thread.currentThread().getName());
		synchronized (this) {
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
	
	public void print()
	{
		this.display();
	}
}


public class Question06 extends Thread
{
	
	static SharedList obj = new SharedList();
	
	public void run()
	{
		obj.print();
	}
	
	 public static void main(String[] args) {
		Question06 obj = new Question06();
		obj.start();
		
		Question06 obj1 = new Question06();
		obj1.start();
	}

}
