package synchronizationBlock.pkg;

import java.util.Scanner;

//Create a program where multiple threads append data to a StringBuffer using a synchronized block.


class DataAppEnd extends Thread
{
	public void run()
	{
		synchronized (this) {
			StringBuffer str = new StringBuffer("ganesh");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the data");
			String adata = sc.next();
			
			System.out.println("Append data "+str.append(" "+adata));
		}
	}
}

public class Question09 {
	
	public static void main(String[] args) {
		DataAppEnd obj = new DataAppEnd();
		obj.start();
		
	}

}
