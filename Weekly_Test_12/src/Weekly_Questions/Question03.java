package Weekly_Questions;

import java.util.Scanner;

/*
 3. String Coding – Palindrome Check:
Write a Java program to check if a string is a palindrome (i.e., the string reads the same forwards and backwards).
 Ignore spaces, punctuation, and case sensitivity.
 */

public class Question03 {
	
	public static void palindrome(String str)
	{
		str.trim();
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		String pstr = "";
		
		for (int i=str.length()-1;i>=0;i--)
		{
			pstr += str.charAt(i);
		}
		
		if (str.equalsIgnoreCase(pstr))
		{
			System.out.println("This is Palindrome");
		}
		else
		{
			System.out.println("This is not Palindrome");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str = sc.next();

		palindrome(str);
	}

}
