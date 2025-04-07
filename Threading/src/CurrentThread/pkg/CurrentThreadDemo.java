package CurrentThread.pkg;

class Thread01 extends Thread
{
	public void run()
	{
		System.out.println("Current Thread is :"+Thread.currentThread().getName());
	}
}

public class CurrentThreadDemo {
	
	
	public static void main(String[] args) {
		
		System.out.println("Current Thread is :"+Thread.currentThread().getName());
		Thread01 obj = new Thread01();
		Thread01 obj1 = new Thread01();
		Thread01 obj2 = new Thread01();
		Thread01 obj3 = new Thread01();
		obj.start();
		obj1.start();
		obj2.start();
		obj3.start();
		
	}

}
