package synchronizationBlock.pkg;

//Demonstrate the use of a synchronized block to print a sequence of numbers from different threads in an orderly manner.

class SequenceNum extends Thread
{
	int startnum;
	public SequenceNum(int startnum)
	{
		this.startnum = startnum;
	}
	
	public void run()
	{
		synchronized (this) {
			
			for (int i=startnum;i<=20;i++)
			{
				System.out.println("Current thread "+Thread.currentThread().getName());
			}
		}
	}
}

public class Question10 {
	public static void main(String[] args) {
		SequenceNum obj = new SequenceNum(5);
		obj.start();
		SequenceNum obj1 = new SequenceNum(10);
		obj1.start();
		SequenceNum obj2 = new SequenceNum(15);
		obj2.start();
		
	}

}
