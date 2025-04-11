package synchronizationBlock.pkg;

//1. Write a Java program to demonstrate a synchronized block inside a method.  


class Shared01
{
	public void print()
	{
		System.out.println("Current thread :"+Thread.currentThread().getName());
		
		synchronized (this) {
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



public class Question01 extends Thread
{
	static Shared01 obj;
	public void run()
	{
		obj.print();
	}
	
	public static void main(String[] args) {
		obj = new Shared01();
		
		Question01 ob = new Question01();
		ob.start();
	}
}
