package QuestionsSolvedUsingMethods.pkg;

import java.util.Random;

//Implement a thread that pauses execution using sleep for a random time between 1-5 seconds before printing a message.

class ThreadTime extends Thread
{
	public void run()
	{
		Random ra = new Random();
		int sleeptime = 1000 +ra.nextInt(4000);
		
		try {
			System.out.println("message...");
			Thread.sleep(sleeptime);
			System.out.println("Done...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class Question08 {
	public static void main(String[] args) {
		ThreadTime obj = new ThreadTime();
		obj.start();
	}

}
