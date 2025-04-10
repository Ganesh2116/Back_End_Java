package Synchronization.pkg;

//Q1. Reverse the vowels only (Flipkart)
//S ="practice"
//Output: prectica
//Explanation: The vowels are a, i, e
//Reverse of these is e, i, a.
//\


class Reverse extends Thread
{
	public synchronized void run()
	{
		StringBuffer str = new StringBuffer("practice");
		String vstr = "";
		
		for ( int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if ("AEIOUaeiou".indexOf(ch) != -1)
			{
				vstr += str.charAt(i);
			}
		}
		
		int x = vstr.length()-1;
		for ( int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if ("AEIOUaeiou".indexOf(ch) != -1)
			{
				str.replace(i, i+1, String.valueOf(vstr.charAt(x)));
				x--;
			}
		}
		
		System.out.println("Out put is :"+str);
	}
}

public class Question11 {
	
	public static void main(String[] args) {
		Reverse obj = new Reverse();
		obj.start();
	}

}
