package Questions;
//2)Implement a program to find the first non-repeating character in a given string.

public class Question02 {
	
	public static void firstNonRepeating(String str)
	{	
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
			{
				System.out.println("First Non Repeting char is:"+str.charAt(i));
				break;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		String str = "java programming";
		firstNonRepeating(str);
	}

}
