package QuestionsSolvedUsingMethods.pkg;
//Write a program where a thread prints numbers from 1 to 5, with a 1-second delay between each print using sleep

class Mythread extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}

public class Question01 {
	public static void main(String[] args) {
		Mythread obj = new Mythread();
		obj.start();
	}

}
