package Question.pkg;

//1. Create a thread using the Thread class to reverse every word in a string independently  

class Reverse extends Thread
{
	public void run()
	{
		String str = "this is java porgram";
		String words[] = str.split(" ");
		
		for (int i =0;i<words.length;i++)
		{
			char ch[] = words[i].toCharArray();
			
			for (int j=ch.length-1;j>=0;j--)
			{
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
	}
}

public class Question01 {
	public static void main(String[] args) {
		Reverse obj = new Reverse();
		obj.start();
	}

}
