package DaemonThread.pkg;

//Modify a normal thread to a daemon thread using setDaemon(true) and print its status.

class Normal extends Thread
{
	public void run()
	{
		System.out.println("Normal Thread..");
	}
}

public class Question02 {
	
	public static void main(String[] args) {
		Normal obj = new Normal();
		obj.setDaemon(true);
		obj.start();
	}

}
