package synchronizationBlock.pkg;

// Write a Java program where a synchronized block is used to ensure only one thread updates
//a shared string variable.

class SharecClasss extends Thread
{
	public void run() {
		
		synchronized (this) {

			System.out.println("updated thread msg :"+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}


public class Question08 {
	
	public static void main(String[] args) {
		SharecClasss obj = new SharecClasss();
		obj.setName("Thread01");
		obj.start();
		SharecClasss obj1 = new SharecClasss();
		obj1.setName("Thread02");
		obj1.start();
		SharecClasss obj2 = new SharecClasss();
		obj2.setName("Thread03");
		obj2.start();
	}

}
