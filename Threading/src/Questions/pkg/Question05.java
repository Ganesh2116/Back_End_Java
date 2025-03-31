package Questions.pkg;

//Q13. Write a Java program to create a new string repeating every character twice of a 
//given string.
//Sample Output:
//The given string is: welcome
//The new string is: wweellccoomme

class RepeatingEveryChar extends Thread
{	
	public static void repeatCharTwice()
	{
		String str = "welcome";
		StringBuffer newStr = new StringBuffer();
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			newStr.append(ch);
			newStr.append(ch);
		}
		
		System.out.println("This new string is:"+newStr);
	}
	
	public void run()
	{
		repeatCharTwice();
	}
}

public class Question05 {
	
	public static void main(String[] args) {
		RepeatingEveryChar obj = new RepeatingEveryChar();
		obj.start();
	}
}
