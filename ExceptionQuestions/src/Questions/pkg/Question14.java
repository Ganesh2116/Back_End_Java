package Questions.pkg;

import java.io.IOException;
import java.util.Scanner;

//Create a method that explicitly throws an IOException and handle it in the main method.

public class Question14 {
	static void display() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number here:");
		
		 if (!sc.hasNextInt()) { // Check if input is not an integer
	            throw new IOException("Invalid input: Not a number");
	        }
		 int num = sc.nextInt();
	}
	
	public static void main(String[] args) {
		
		try {
			display();
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
