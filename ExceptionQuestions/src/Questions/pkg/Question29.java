package Questions.pkg;

import java.io.IOException;
import java.util.Scanner;

public class Question29 {
	public static void display()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter numerator: ");
            int num = sc.nextInt();
            System.out.print("Enter denominator: ");
            int denom = sc.nextInt();
            int result = num / denom; 
            System.out.println("Result: " + result);

            
            if (num == 100) {
                throw new IOException();
            }
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
		display();
	}

}
