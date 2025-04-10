package Synchronization.pkg;

//Write a class with a synchronized method that adds two numbers and prints the sum.

class Addition extends Thread
{
	public synchronized void run()
	{
		int num = 10;
		int num1 = 20;
		 
		try {
			Thread.sleep(1000);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Additon of two number is :"+(num+num1));
	}
}

public class Question05 {
	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.start();
	}

}
