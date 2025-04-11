package synchronizationBlock.pkg;
//Demonstrate how a synchronized block can be used inside a loop to ensure thread safety.

class Print 
{
	public void display()
	{
		for (int i=1;i<=5;i++)
		{
			synchronized (this) {
				System.out.println("Current thread"+Thread.currentThread().getName());
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}


public class Question05 extends Thread
{
	static Print obj = new Print();
	
	public void run()
	{
		obj.display();
	}

	public static void main(String[] args) {
		Question05 obj = new Question05();
		obj.start();
		
		Question05 obj1 = new Question05();
		obj1.start();
	}
}
