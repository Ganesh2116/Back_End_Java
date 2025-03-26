package Questions.pkg;

import java.io.IOException;

// 27. Write a program that rethrows an exception after catching it in a catch block.  
public class Question27 {
	public static void print() throws IOException
	{
		throw new IOException();
	}
	static void display()
	{
		try {
			print();
		} catch (IOException e) {
			System.out.println(e);
		}	
	}
	public static void main(String[] args) {
		try {
			display();
		} catch (Exception e) {
			System.out.println(e);
		}
	}	

}