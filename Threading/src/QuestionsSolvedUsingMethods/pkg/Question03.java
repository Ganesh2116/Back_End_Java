package QuestionsSolvedUsingMethods.pkg;

//Implement a thread that simulates a countdown timer from 10 to 1, with a 500ms delay between numbers.

class SimulatesThread extends Thread
{
	public void run()
	{
		System.out.println("Count Down :");
		for (int i=10;i>=1;i--)
		{
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}

public class Question03 {
	public static void main(String[] args) {
		SimulatesThread obj = new SimulatesThread();
		obj.start();
	}

}
