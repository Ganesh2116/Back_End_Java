package Question.pkg;

//Create a thread using the Thread class to count vowels in each word of a sentence using 
//multiple threads


class CountVowels extends Thread
{
	private String str;
	
	public CountVowels(String str)
	{
		this.str = str;
	}
	
	public void CountV()
	{
		String words[] = str.split(" ");
		
		for (int i=0;i<str.length();i++)
		{
			char ch[] = words[i].toCharArray();
			int count=0;
			for (int j=0;j<ch.length;j++)
			{
				if (ch[j] == 'a'||ch[j] == 'i'||ch[j] == 'o'||ch[j] == 'u'||ch[j] == 'A'||ch[j] == 'I'||
						ch[j] == 'O'||ch[j] == 'U')
				{
					count++;
				}
			}
			
			
			System.out.println("This words "+words[i]+" vowel count is :"+count);
		}
	}
	
	public void run()
	{
		CountV();
	}
	
}

public class Question02 {
	public static void main(String[] args) {
		
		String str = "this is java program";
		CountVowels obj = new CountVowels(str);
		
		obj.start();
	}

}
