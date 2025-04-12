package Questions.pkg;

import java.util.Arrays;

//8.Check if two strings are anagrams of each other.
//Input: "listen", "silent" → Output: true

class Anagrams 
{
	public void display()
	{
		String str = "listen";
		String str1 = "silent";
		
		char ch[] = str.toCharArray();
		char ch1[] = str1.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		if (str.length() == str.length())
		{
			if (Arrays.equals(ch, ch1))
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		else
		{
			System.out.println("length are not equal");
		}
	}
}


public class Question08 {

	public static void main(String[] args) {
		Anagrams obj = new Anagrams();
		obj.display();
		
	}
}
