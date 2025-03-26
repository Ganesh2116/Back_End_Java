package Questions.pkg;
//Create a program that catches an ArrayIndexOutOfBoundsException when accessing an invalid array index.

public class Question02 {
	public static void print()
	{
		int arr[] = {1,2};
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
	print();	
	}

}
