package Questions.pkg;

//Q6.Wap enter a string and print first non repeating character using class and object.


class NonRepeatingChar extends Thread
{
	public void run()
	{
		String str ="programmg";
		
		for (int i=0;i<str.length();i++)
		{
			if (str.indexOf(i) == str.lastIndexOf(i))
			{
				System.out.println("Non Repeating char :" +str.charAt(i));
				break;
			}
		}
	}
}

public class Question11 {
	
	public static void main(String[] args) {
		NonRepeatingChar obj = new NonRepeatingChar();
		obj.start();
	}

}
