package Questions.pkg;
//Write a method that throws an IllegalArgumentException if a negative number is passed as an argument.

public class Question11 {
	
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
	
	
	public static void main(String[] args) {
		try {
			display(-9);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
