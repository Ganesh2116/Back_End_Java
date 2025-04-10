package Synchronization.pkg;

//Q2. Delete alternate characters (Amazon)
//Input: S = "Geeks"
//Output: "Ges"
//Explanation: Deleted "e" at index 1
//and "k" at index 3.

class DeleteAlternate extends Thread
{
	String str = "Amazon";
	
	public synchronized void deletechar()
	{
		System.out.println("Input is :"+str);
		System.out.println("Output is :");
		for (int i=0;i<str.length();i++)
		{
			if (i%2 == 0)
			{
				System.out.print(str.charAt(i));
			}
		}
	}
	
	public void run()
	{
		deletechar();
	}
}

public class Question12 {
	public static void main(String[] args) {
		DeleteAlternate obj = new DeleteAlternate();
		obj.start();
	}

}
