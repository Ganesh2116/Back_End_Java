package Synchronization.pkg;

import java.util.Scanner;

//Create a synchronized method that takes a name as input and prints "Welcome, [name]".

class Welcome extends Thread
{
	public synchronized void run()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name ");
		String name = sc.next();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Welcome, "+name);
	}
}

public class Question04 {
	public static void main(String[] args) {
		Welcome obj = new Welcome();
		obj.start();
	}

}
