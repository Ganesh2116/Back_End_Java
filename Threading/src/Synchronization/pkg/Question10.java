package Synchronization.pkg;

import java.util.Scanner;

//Create a synchronized method that takes a string and prints each character one by one.

class EachChar extends Thread
{
	public synchronized void run()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string here");
		String str = sc.next();
		
		for (int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class Question10 {
	public static void main(String[] args) {
		EachChar obj = new EachChar();
		obj.start();
		
	}

}
