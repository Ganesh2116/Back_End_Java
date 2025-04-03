package InterfaceThreadUsingRunable.pkg;

import java.util.Scanner;

/*
 7. Check if Two Strings are Isomorphic
   Problem Description:  
   Write a Java program to check if two strings are isomorphic using a HashMap. 
   Two strings are isomorphic if the characters in one string can be replaced to get the other string.

   Input: Two strings.  
   Output: true or false.

   Example:
   - Input: "foo", "bar"
   - Output: false

   - Input: "egg", "add"
   - Output: true

---
 */

class Isomorphic implements Runnable
{	
	private String s1;
	private String s2;
	public Isomorphic(String str1,String str2)
	{
		this.s1 = str1;
		this.s2 = str2;
	}
	
	public boolean checkIsomprphic()
	{
		if (s1.length() != s2.length()) 
		{
            return false;
        }
        
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        
        for (int i = 0; i < s1.length(); i++) 
        {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            
            if (map1[c1] != map2[c2]) 
            {
                return false;
            }
            
            map1[c1] = i + 1;
            map2[c2] = i + 1;
        }
        
        return true;
    }
	
	public void run()
	{
		System.out.println(checkIsomprphic());
	}
}

public class Question01 {
	public static void main(String[] args) {
		Isomorphic obj = new Isomorphic("abc","def");
		Thread ob = new Thread(obj);
		ob.start();
		
	}

}
