package QuestionsSolvedUsingMethods.pkg;

//Write a program where two threads print alternate numbers from 1 to 10 with sleep delays.


class Thread00 extends Thread
{
	public synchronized void oddPrint()
	{
		try {
			Thread.sleep(500);
			for (int i=1;i<=10;i++)
			{
				if (i%2 == 0)
				{
					System.out.println(i);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public synchronized void evenPrint()
	{
		try {
			Thread.sleep(500);
			for (int i=1;i<=10;i++)
			{
				if (i%2 != 0)
				{
					System.out.println(i);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}

public class Question04 {
	public static void main(String[] args) {
		Thread00 obj = new Thread00();
		
		Thread ob = new Thread(() -> obj.oddPrint());
		Thread ob1 = new Thread(() -> obj.evenPrint());
		
		ob.start();
		ob1.start();
		
	}

}
