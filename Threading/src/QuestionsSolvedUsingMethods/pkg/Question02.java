package QuestionsSolvedUsingMethods.pkg;

//2. Create a program where multiple threads print their names but pause for different durations using sleep.  


class Thread01 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}

public class Question02 {
	public static void main(String[] args) {
		Thread01 obj = new Thread01();
		Thread01 obj1 = new Thread01();
		Thread01 obj2 = new Thread01();
		Thread01 obj3 = new Thread01();
		
		obj.start();
		
		try {
		Thread01.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		obj1.start();
		
		try {
			Thread01.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		obj2.start();
		
		try {
			Thread01.sleep(3000);
			} catch (Exception e) {
				System.out.println(e);
			}
		obj3.start();
		
	}

}
