package Questions.pkg;

//Create a program where an exception occurs inside a catch block, and handle it properly.

public class Question08 {
	
	public static void display()
	{
		try {
			int n = 100;
			System.out.println(n/0);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		display();
	}

}
