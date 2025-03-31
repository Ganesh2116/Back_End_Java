package Questions.pkg;

import java.util.Arrays;
import java.util.Scanner;

//Q7.Wap enter a string and check it is anagram or not  constructor and using class and object.

class AnagramCheck extends Thread
{
	String str;
	String str1;
	AnagramCheck()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string ");
		this.str = sc.next();
		
		System.out.println("Enter 2nd string ");
		this.str1 = sc.next();
	}
	
	public void anagramOrNot()
	{
		if (str.length() == str1.length())
		{
			char ch[] = str.toCharArray();
			char ch1[] = str1.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			if (Arrays.equals(ch, ch1))
			{
				System.out.println("This is anagram");
			}
			else
			{
				System.out.println("This is not anagram");
			}
		}
		else
		{
			System.out.println("Length are not equals they are not anagram");
		}
	}
	
	public void run()
	{
		anagramOrNot();
	}
}

public class Question12 {
	public static void main(String[] args) {
		AnagramCheck obj = new AnagramCheck();
		obj.anagramOrNot();
	}

}
