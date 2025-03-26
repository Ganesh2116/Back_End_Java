package Questions.pkg;

//Develop a program that catches and handles multiple exceptions (ArithmeticException, ArrayIndexOutOfBoundsException).
public class Question06 {
	
	public static void display()
	{
		
		try {
			int num = 100;
			int arr[] = {1,2,0};
			System.out.println(num/arr[2]);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
		display();
	}

}
