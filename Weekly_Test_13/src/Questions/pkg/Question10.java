package Questions.pkg;

import java.util.Scanner;

//10.Write a program that creates a custom exception InvalidAgeException. 
//Throw it if the age entered is below 18.

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}

class Display
{
	int age;
	public Display(int age)
	{
		this.age = age;
	}
	public void print() throws InvalidAgeException
	{
		if (age <18)
		{
			throw new  InvalidAgeException("Enter vaild age");
		}
		else
		{
			System.out.println("valid age is "+age);
		}
	}
	
}

public class Question10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age");
		int age = sc.nextInt();
		
		Display obj = new Display(age);
		try {
			obj.print();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
