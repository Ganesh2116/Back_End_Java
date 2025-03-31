package Questions.pkg;

//Write a Java program to create a new string from a given string swapping the last two 
//characters of the given string. The length of the given string must be two or more.
//Sample Output:
//The given strings is: string 
//The string after swap last two characters are: strign


class Swaping extends Thread
{
	static public void replaceStr()
	{
			String str = "String";
			char[] charArray = str.toCharArray();
	        int len = charArray.length;
	        char temp = charArray[len - 2];
	        charArray[len - 2] = charArray[len - 1];
	        charArray[len - 1] = temp;

	        String swappedString = new String(charArray);
	        System.out.println("The string after swapping last two characters: " + swappedString);
		
	}
	
	public void run()
	{
		replaceStr();
	}
}

public class Question01 {
	
	public static void main(String[] args) {
		Swaping obj = new Swaping();
		obj.start();
	}

}
