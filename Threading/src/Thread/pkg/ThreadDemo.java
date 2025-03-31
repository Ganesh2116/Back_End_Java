package Thread.pkg;


class Thread1 extends Thread
{
	public void run()
	{
		for (int i =1;i<10;i++)
		{
			System.out.print(i+" ");
		}
	}
}

public class ThreadDemo {
	
	public static void main(String[] args) {
		Thread1 obj = new Thread1();
		obj.start();
		
	}

}
