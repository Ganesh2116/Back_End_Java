package Questions.pkg;

//Q3.Wap input a string and print only those word which first character is vowel.


class VowelWords extends Thread
{
	public void startVowels()
	{
		String str = "Thi is java program";
		String words[] = str.split(" ");
		
		for (int i=0;i<words.length;i++)
		{
			char ch = words[i].charAt(0);
			if (ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' 
				||ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u')
			{
				System.out.print(words[i]);
			}
		}
		System.out.println(" ");
	}
	
	public void run()
	{
		startVowels();
	}
}

public class Question08 {
	public static void main(String[] args) {
		VowelWords obj = new VowelWords();
		obj.start();
	}

}
