package Questions.pkg;

//1.Check if a given string is a palindrome (ignore spaces and case).
//Input: "Madam In Eden Im Adam" → Output: Palindrome


class PalindromeCheck extends Thread
{
	String str ="Madam In Eden Im Adam";
	public void display()
	{
		String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
		String nstr = "";
		
		for (int i=cleanStr.length()-1;i>=0;i--)
		{
			char cha = cleanStr.charAt(i);
			nstr += cha;
		}
	
		if (cleanStr.equals(nstr))
		{
			System.out.println("Output is :palindrome");
		}
		else
		{
			System.out.println("Output is :Not Palindrome");
		}
		
	}
}


public class Question01 {

	public static void main(String[] args) {
		PalindromeCheck obj = new PalindromeCheck();
		obj.display();
	}
	
}
