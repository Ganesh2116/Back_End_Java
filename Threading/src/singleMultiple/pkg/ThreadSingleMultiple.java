package singleMultiple.pkg;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("thread...");
	}
}

class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println("thread...");
	}
}

public class ThreadSingleMultiple {
	
	public static void main(String[] args) {
		MyThread obj = new MyThread();
		MyThread1 obj1 = new MyThread1();
		obj.start();
		obj1.start();
		
	}

}
