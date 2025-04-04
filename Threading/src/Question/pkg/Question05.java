package Question.pkg;

//Create a thread using the Thread class to find all palindromic substrings in a string concurrently


class Palindromic extends Thread
{
	private String str;
	public Palindromic(String str)
	{
		this.str = str;
	}
	
	public void checkPal()
	{
		String nstr = "";
		
		for (int i=str.length()-1;i>=0;i--)
		{
			nstr += str.charAt(i);
		}
		
		if (nstr.equals(str))
		{
			System.out.println("This is palindromic string");
		}
		else
		{
			System.out.println("This is not palindromic string");
		}
	}
	
	public void run()
	{
		checkPal();
	}
}

public class Question05 {
	
	public static void main(String[] args) {
		Palindromic obj = new Palindromic("madam");
		obj.checkPal();
	}

}
