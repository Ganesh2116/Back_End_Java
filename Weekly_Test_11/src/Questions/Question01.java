package Questions;

//1)Write a Java program to check if two given strings are rotations of each other.

public class Question01 {
	
	public boolean stringRotations(String str1,String str2)
	{
		if (str1.length() != str2.length())
		{
			return false;
		}
		
		String rorations = str1 + str1;
		
		return rorations.contains(str2);
	}
	
	
	public static void main(String[] args) {
		Question01 obj = new Question01();
		
		String str1 = "ABCD";
		String str2 = "CDAB";
		
		if (obj.stringRotations(str1, str2))
		{
			System.out.println("This are rotations of each other");
		}
		else
		{
			System.out.println("This are not rotations of each other");
		}
	}

}
