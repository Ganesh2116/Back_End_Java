package Questions.pkg;

import java.io.IOException;

//Develop a program that demonstrates the difference between throw and throws with examples.
public class Question24 {
	
	public static void checkFile() throws IOException
	{
        throw new IOException("Checked Exception: File not found!");
    }

   
    public static void validateAge(int age) 
    {
        if (age < 18) {
            throw new IllegalArgumentException("Unchecked Exception: Age must be 18 or above!");
        }
        System.out.println("Access granted: Age is valid.");
    }

	public static void main(String[] args) {
		try {
            validateAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception Caught: " + e.getMessage());
            System.out.println(e);
        }

       
        try {
            checkFile();
        } catch (IOException e) {
            System.out.println("Exception Caught: " + e.getMessage());
            System.out.println(e);
        }
		
	}

}
