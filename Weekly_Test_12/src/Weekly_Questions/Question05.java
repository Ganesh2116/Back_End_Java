package Weekly_Questions;
/*
5. Threading Coding – Concurrent Number Printing:
Write a Java program that demonstrates the use of threads. The program should:

Create two threads.

The first thread prints numbers from 1 to 5.

The second thread prints numbers from 6 to 10.

Ensure that the numbers from both threads are printed concurrently. 
 */

class FirstThread implements Runnable
{
	public void display()
	{
		System.out.println("Numbers form 1 to 5");
		
		for ( int i=1;i<=5;i++)
		{
			System.out.print(i+" ");
		}
	}
	
	public void run()
	{
		display();
	}
}

class SecondThread implements Runnable
{
	public void display()
	{
		System.out.println("Numbers form 6 to 10");
		
		for ( int i=6;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
	
	public void run()
	{
		display();
	}
}

public class Question05 {
	public static void main(String[] args) {
		FirstThread obj = new FirstThread();
		SecondThread obj2 = new SecondThread();
		
		Thread ob = new Thread(obj);
		Thread ob2 = new Thread(obj2);
		
		ob2.start();
		ob.start();
		
		
	}

}
