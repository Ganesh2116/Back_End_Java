package Questions.pkg;

//Q2.Wap enter a string and find the count of word and character(excluding space).

class WordCount extends Thread
{
	public void run()
	{
		String str = "    this is java program     ";
		String words[] = str.trim().split(" ");
		System.out.println("word count "+words.length);
	}
}

public class Question07 {
	public static void main(String[] args) {
		WordCount obj = new WordCount();
		obj.start();
	}

}
