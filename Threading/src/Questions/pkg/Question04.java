package Questions.pkg;

//Q12. Write a Java program to read a given string and if the first or last characters are same 
//return the string without those characters otherwise return the string unchanged.
//Sample Output:
//The given strings is: testcricket
//The new string is: estcricke

class FirstLastSameCharOr extends Thread
{ 
	public static void checkChar()
	{
		String str = "testcricket";
		char fch = str.charAt(0);
		char lch = str.charAt(str.length()-1);
		
		if (Character.toLowerCase(lch) == Character.toLowerCase(fch) )
		{
			System.out.println("now string is:"+str.substring(1,str.length()-1));
		}
		else
		{
			System.out.println("now string is:"+str);
		}
		
	}
	public void run()
	{
		checkChar();
	}
}



public class Question04 {
	public static void main(String[] args) {
		FirstLastSameCharOr obj = new FirstLastSameCharOr();
		obj.checkChar();
	}

}
