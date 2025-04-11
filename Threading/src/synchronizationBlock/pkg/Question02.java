package synchronizationBlock.pkg;

//Create a program where multiple threads increment a shared counter using a synchronized block.

class displayShared 
{
	public void print()
	{
		synchronized (this) {
			
			System.out.println("Counter :");
			for (int i=1;i<=10;i++)
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
}


public class Question02 extends Thread
{
	static displayShared obj = new displayShared();
	public void run()
	{
		obj.print();
	}
	
	public static void main(String[] args) {
		Question02 obj = new Question02();
		Question02 obj1 = new Question02();
		Question02 obj2 = new Question02();
		Question02 obj3 = new Question02();
		Question02 obj4 = new Question02();
		obj.start();
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
	}

}
