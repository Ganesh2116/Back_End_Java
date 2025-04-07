package PriorityThreadMethod.pkg;

class ThreadClass extends Thread
{
	public void run()
	{
		System.out.println("Current Thread is :"+Thread.currentThread().getName());
	}
}

public class PriorityThreadDemo {
	public static void main(String[] args) {
		ThreadClass obj = new ThreadClass();
		ThreadClass obj1 = new ThreadClass();
		ThreadClass obj2 = new ThreadClass();
		
		obj.setPriority(Thread.MIN_PRIORITY);
		obj1.setPriority(Thread.MAX_PRIORITY);
		obj2.setPriority(Thread.NORM_PRIORITY);
		obj.start();
		obj1.start();
		obj2.start();
		
		System.out.println("Get priority obj "+obj.getPriority());
		System.out.println("Get priority obj1 "+obj1.getPriority());
		System.out.println("Get priority obj2 "+obj2.getPriority());
	}

}
