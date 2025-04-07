package JoinMethod.pkg;

class ThreadClass extends Thread
{
	public void run()
	{
		System.out.println("Current Thread is :"+Thread.currentThread().getName());
	}
}

public class joinMethodDemo {
	public static void main(String[] args) {
		ThreadClass obj = new ThreadClass();
		ThreadClass obj1 = new ThreadClass();
		ThreadClass obj2 = new ThreadClass();
		ThreadClass obj3 = new ThreadClass();
		ThreadClass obj4 = new ThreadClass();
		obj.start();
		
		try {
			obj.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		
		
	}
}
