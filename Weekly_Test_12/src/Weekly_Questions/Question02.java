package Weekly_Questions;

import java.util.Scanner;

/*
 2. Exception Handling – Java Program:
Write a Java program that handles multiple exceptions. The program should:

Take two numbers as input from the user.

Perform division and handle ArithmeticException if division by zero occurs.

Handle NumberFormatException if the input is not a valid number.

Display appropriate error messages for each exception.
 */

public class Question02 {

    public static void exceptionHandling() 
    {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the 1st number :");
            String inputnum1 = sc.next();

            System.out.println("Enter the 2nd number :");
            String inputnum2 = sc.next();

            int num1 = Integer.parseInt(inputnum1);
            int num2 = Integer.parseInt(inputnum2);

            int result = num1 / num2;

            System.out.println("Division of two numbers: " + result);

        } catch (ArithmeticException e) {
        	
            System.out.println("Zero cannot be used as a divisor.");

        } catch (NumberFormatException e) {
        
        	System.out.println("Please enter valid numeric values.");

        }  
    }

    public static void main(String[] args) {
        exceptionHandling();
    }
}
