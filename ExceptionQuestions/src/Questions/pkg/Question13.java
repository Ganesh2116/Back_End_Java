package Questions.pkg;

//Write a Java program that demonstrates exception propagation by calling multiple methods.

public class Question13 {
	static public void display(int num) throws IllegalArgumentException
	{
		if (num <0)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			System.out.println("number is :"+num);
		}
	}
	
	static void print()
	{
		try {
			display(-9);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	static void displayMethod()
	{
		print();
	}
	
	public static void main(String[] args) {
		displayMethod();
	}

}
