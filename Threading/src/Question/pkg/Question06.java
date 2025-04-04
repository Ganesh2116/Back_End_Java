package Question.pkg;

//Create a thread using the Thread class to count frequency of each character in a string using threads

class Frequency extends Thread
{
	private String str;
	
	public Frequency(String str)
	{
		this.str = str;
	}
	
	public void CountFrequency()
	{
		
		int freq[] = new int[256];
		
		for (char ch : str.toCharArray())
		{
			freq[ch]++;
		}
		
		System.out.println("Character Frequency:");
		
        for (int i = 0; i < 256; i++) 
        {
            if (freq[i] > 0) 
            {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
	}
	
	public void run()
	{
		CountFrequency();
	}
}

public class Question06 {
	
	public static void main(String[] args) {
		String str = "programming";
		
		Frequency obj = new Frequency(str);
		obj.start();
	}

}
