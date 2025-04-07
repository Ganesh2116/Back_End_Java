package QuestionsSolvedUsingMethods.pkg;

//Create a thread that prints numbers, but if it is interrupted while sleeping, 
//it should handle the exception and print "Interrupted" instead.


class NumberPrintingThread extends Thread 
{
	public void run()
	{
		try {
			for (int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
public class Question09 {
	public static void main(String[] args) {
		NumberPrintingThread obj = new NumberPrintingThread();
		obj.start();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
		
		obj.interrupt();
		
	}

}
