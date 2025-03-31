package Questions.pkg;


//Q10. Write a Java program to read a given string and if the first or last characters are same 
//return the string without those characters otherwise return the string unchanged

class FirstLastSameCharOrNot extends Thread
{ 
	public static void checkChar()
	{
		String str = "helloH";
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



public class Question02 {
	public static void main(String[] args) {
		FirstLastSameCharOrNot obj = new FirstLastSameCharOrNot();
		obj.checkChar();
	}

}
