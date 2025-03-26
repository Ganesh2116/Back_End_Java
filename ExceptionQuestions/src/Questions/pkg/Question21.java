package Questions.pkg;

import java.io.IOException;
import java.util.Scanner;

//Write a Java program to demonstrate the difference between checked and unchecked exceptions 
//using IOException and NullPointerException.
public class Question21 {
    
    static void display() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        sc.close();

        if (str.isEmpty()) {
            throw new IOException("Checked Exception: Input cannot be empty!");
        }
        
        if (str.equals("null")) { 
            str = null;
        }

        System.out.println("String length: " + str.length()); 
        System.out.println("String is: " + str);
    }

    public static void main(String[] args) {
        try {
            display();
        } catch (IOException e) {
            System.out.println("Caught Checked Exception: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught Unchecked Exception: " + e);
        }
    }
}
