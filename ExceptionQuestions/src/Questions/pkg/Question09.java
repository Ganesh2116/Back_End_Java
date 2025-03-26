package Questions.pkg;
//Write a Java program that uses nested try-catch blocks to handle different exceptions at different levels.
public class Question09 {
	
	public static void display()
	{
		try {
			int arr[]= {1,2,0};
			try {
				System.out.println(10/arr[2]);
				
			} catch (ArithmeticException e) {
				System.out.println(e);	
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		display();
	}

}
