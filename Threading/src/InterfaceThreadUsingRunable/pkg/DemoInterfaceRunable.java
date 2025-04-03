package InterfaceThreadUsingRunable.pkg;


class MyThread implements Runnable
{
	public void run()
	{
		for (int i=0;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
}

public class DemoInterfaceRunable {
	public static void main(String[] args) {
		MyThread obj = new MyThread();
		Thread ob = new Thread(obj);
		ob.start();
	}

}
