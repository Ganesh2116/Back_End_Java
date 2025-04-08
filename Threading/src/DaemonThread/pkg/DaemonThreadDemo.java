package DaemonThread.pkg;



class MyThread extends Thread
{
	public void run()
	{
		System.out.println("java daemon thread..");
	}
}

public class DaemonThreadDemo {
	
	public static void main(String[] args) {
		MyThread obj = new MyThread();
		System.out.println(obj.isDaemon());
		obj.setDaemon(true);
		System.out.println(obj.isDaemon());
		obj.start();
		System.out.println(obj.isDaemon());
		
	}

}
