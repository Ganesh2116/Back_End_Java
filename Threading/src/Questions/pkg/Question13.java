package Questions.pkg;

import java.util.Scanner;

//Q8.Wap enter a string and print most repeated character in string.

class MostRepeatedChar extends Thread
{
	String str;
	MostRepeatedChar()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter here string");
		this.str = sc.next();
	}
	
	public void mostRepeated()
	{
		char mostRepeatedChar = ' ';
	    int maxCount = 0;

	    for (int i = 0; i < str.length(); i++) 
	    {
	        int count = 1;
	        char ch = str.charAt(i);

	        for (int j = i + 1; j < str.length(); j++) {
	            if (ch == str.charAt(j)) {
	                count++;
	            }
	        }

	        if (count > maxCount) {
	            maxCount = count;
	            mostRepeatedChar = ch;
	        }
	    }

	    System.out.println("Most repeated character: " + mostRepeatedChar + " (occurs " + maxCount + " times)");
	}
	
	public void run()
	{
		mostRepeated();
	}
}

public class Question13 {
	public static void main(String[] args) {
		MostRepeatedChar obj = new MostRepeatedChar();
		obj.start();
	}

}
