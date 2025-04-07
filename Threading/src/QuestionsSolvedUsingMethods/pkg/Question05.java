package QuestionsSolvedUsingMethods.pkg;

//Implement a program that simulates a progress bar using sleep where a dot is printed every second.


class ThreadProgram extends Thread
{
	public void run()
	{
		System.out.print("progress");
		for (int i=1;i<=10;i++)
		{
			System.out.print(".");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println();
		System.out.println("Done.");
	}
}

public class Question05 {
	public static void main(String[] args) {
		ThreadProgram obj = new ThreadProgram();
		obj.start();
	}

}
