package Questions.pkg;
//Create a Java program to catch and handle NumberFormatException when converting a string to an integer.

public class Question04 {
	public static void display()
	{
		String str ="123abc";
		
		try {
			System.out.println(Integer.parseInt(str));
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		display();
	}

}
