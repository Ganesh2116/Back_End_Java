package Questions.pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

//Write a program that uses a try-catch block to catch InputMismatchException while reading input using Scanner.

public class Question05 {
	
	public static void display()
	{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = sc.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		display();
	}

}
