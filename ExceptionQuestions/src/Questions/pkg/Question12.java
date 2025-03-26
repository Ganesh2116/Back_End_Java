package Questions.pkg;

//Develop a program where a method calls another method that throws an exception, and handle it using throws.

public class Question12 {
	
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
	
	public static void main(String[] args) {
		print();
	}

}
