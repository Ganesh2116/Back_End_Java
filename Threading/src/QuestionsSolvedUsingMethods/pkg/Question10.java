package QuestionsSolvedUsingMethods.pkg;

//Implement a stopwatch simulation where a thread prints elapsed seconds indefinitely until the user interrupts it.

class Stopwatch extends Thread
{
	public void run()
	{
		int sec = 0;
		
		System.out.println("StopWatch");
		try {
			while (true)
			{
				System.out.println(sec);
				Thread.sleep(1000);
				sec++;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class Question10 {
	
	public static void main(String[] args) {
		Stopwatch obj = new Stopwatch();
		
		obj.start();
		
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		obj.interrupt();
		
	}

}
