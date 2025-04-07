package QuestionsSolvedUsingMethods.pkg;

//7. Create a thread that prints "Processing..." every second for 5 times.  


class ProcessingThread extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(1000);
			} 
			catch (Exception e) 
			{
				System.out.println(e);
			}
			
			
			for (int j=1;j<=5;j++)
			{
				System.out.println("Processing...");
			}
		}
		
	}
}

public class Question07 {
	public static void main(String[] args) {
		ProcessingThread obj = new ProcessingThread();
		obj.start();
	}

}
