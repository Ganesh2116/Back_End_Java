package QuestionsSolvedUsingMethods.pkg;

//6. Write a program where a thread sleeps for 3 seconds and then prints a message.  


class ProgramThread extends Thread
{
	public void run()
	{
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Thread sleeps for 3 seconds");
	}
}

public class Question06 {
	public static void main(String[] args) {
		ProgramThread obj = new ProgramThread();
		obj.start();
	}

}
