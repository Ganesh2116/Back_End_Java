package Questions.pkg;

//Develop a program that handles exceptions inside a loop and continues execution without terminating.

public class Question28 {
	static void display() throws ArithmeticException
	{
		int arr[] = {1,0,3};
		int num = 10;
		for ( int i =0;i<arr.length;i++)
		{
			try {
				int div = num/arr[i];
				System.out.println("div is"+div);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		display();
	}
}
