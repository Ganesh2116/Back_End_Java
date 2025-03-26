package Questions.pkg;
//7. Write a Java program that includes a finally block and demonstrates its execution.  

public class Question07 {
	
	public static void display()
	{
		try {
			System.out.println(5/0);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("run program");
		}
	}
	
	public static void main(String[] args) {
		display();
		}
}
