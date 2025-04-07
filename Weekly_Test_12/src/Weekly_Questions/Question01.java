package Weekly_Questions;

import java.util.Scanner;

/*
1. OOPs Coding – Java Class:
Write a Java class Student that has properties: name, age, and grade. Create a method display() that prints
 the student's details. Instantiate an object of the class and display the information.
 */

class Student 
{
	private String name;
	private int age;
	private int grade;
	
	public Student(String name,int age,int grade)
	{
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public void display()
	{
		System.out.println("Student Details");
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Grade :"+grade);
		
	}
}

public class Question01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name of student");
		String name = sc.next();
		
		System.out.println("Enter the age of student");
		int age = sc.nextInt();
		
		System.out.println("Entet the grade of student");
		char ch = sc.next().charAt(0);
		
		Student obj = new Student(name, age, ch);
		obj.display();
	}
}
