package Questions.pkg;

//Write a Java program that catches an ArithmeticException when dividing a number by zero

public class Question01 {
	public static void print()
	{
		int n= 5;
		try {
			System.err.println(n/0);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		print();
	}

}
