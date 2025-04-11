package synchronizationBlock.pkg;

//Write a Java program to synchronize access to a method that prints numbers from 1 to 10.

class Synchro 
{
	public synchronized void print()
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
}

class Display extends Thread
{
	static Synchro obj = new Synchro();
	public void run()
	{
		obj.print();
	}
}

public class Question04 {
	
	public static void main(String[] args) {
		Display obj = new Display();
		Display obj1 = new Display();
		Display obj2 = new Display();
		obj.start();
		obj1.start();
		obj2.start();
	}

}
