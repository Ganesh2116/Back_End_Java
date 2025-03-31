package Questions;
//3)Write a Java method to reverse every word in a given string while keeping the order of words intact.
public class Question03 {
	
	public static void reverseWord(String str)
	{
		String words[] = str.split(" ");
		
		for (int i=0;i<words.length;i++)
		{
			// 1st way
			for (int j=words[i].length()-1;j>=0;j--)
			{
				System.out.print(words[i].charAt(j));
			}
			System.out.print(" ");
			
			// 2nd way
			for (int j = 0; j < words.length; j++) {
	            String reversedWord = new StringBuilder(words[j]).reverse().toString();
	            System.out.print(reversedWord + " ");
	        }
		}
	}

	public static void main(String[] args) {
		String str = "This is java program";
		reverseWord(str);
	}
}
