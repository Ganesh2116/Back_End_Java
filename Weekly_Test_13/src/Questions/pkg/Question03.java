package Questions.pkg;

//3.Replace all vowels in a string with ‘*’.
//Input: "hello world" → Output: "h*ll* w*rld"


class VowelsAllTo 
{
	String str = "hello world";
	
	public void display()
	{
		System.out.println("Output is :");
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if ("AEIOUaeiou".indexOf(ch) != -1)
			{
				System.out.print("*");
			}
			else if (" ".equals(ch))
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print(ch);
			}
		}
		
	}
}

public class Question03 {
	public static void main(String[] args) {
		VowelsAllTo obj = new VowelsAllTo();
		obj.display();
	}

}
