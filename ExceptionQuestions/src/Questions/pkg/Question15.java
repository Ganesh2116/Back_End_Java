package Questions.pkg;
//Develop a Java program that throws an InterruptedException and catches it using try-catch.

import java.util.Scanner;

public class Question15 {
	
	static void display() throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number here:");
	
		if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
            System.out.println("Processing...");
            Thread.sleep(2000); 
        }  else {
            throw new InterruptedException("Invalid input, process interrupted.");
        }
	}
	
	public static void main(String[] args) {
		try {
			display();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
