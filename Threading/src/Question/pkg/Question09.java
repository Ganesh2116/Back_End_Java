package Question.pkg;

import java.util.Arrays;

//Create a thread using the Thread class to check anagram status between multiple string pairs

class Anagram extends Thread
{
	private String str;
	private String str1;
	
	public Anagram(String str,String str1)
	{
		this.str = str;
		this.str1 = str1;
	}
	
	public boolean isAnagram(String s1, String s2) 
	{
        if (s1.length() != s2.length()) 
        {
            return false;
        }
     
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
	}
	
	public void run()
	{
		if (isAnagram(str1, str)) 
		{
            System.out.println(str1 + " and " + str + " are anagrams.");
        } 
		else 
		{
            System.out.println(str1 + " and " + str + " are NOT anagrams.");
        }
	}
}


public class Question09
{
	public static void main(String[] args) 
	{
		 String[][] pairs = {
		            {"listen", "silent"},
		            {"triangle", "integral"},
		            {"hello", "world"},
		            {"evil", "vile"},
		            {"java", "avaj"}
		        };
		 Thread[] threads = new Thread[pairs.length];
		 
		 for (int i=0;i<pairs.length;i++)
		 {
			 threads[i] = new Anagram(pairs[i][0], pairs[i][1]);
			 threads[i].start();
		 }
		
	}	
}