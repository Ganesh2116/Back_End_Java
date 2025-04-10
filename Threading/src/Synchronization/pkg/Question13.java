package Synchronization.pkg;


//Q3. Extract the integers (Zoho)
//Input:
//s = "1: Prakhar Agrawal, 2: Manish Kumar Rai,
//3: Rishabh Gupta56"
//Output: 1 2 3 56
//Explanation:
//1, 2, 3, 56 are the integers present in s.


class ExtractInt extends Thread
{
	String str = "1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta56";
	String num = "";
	public synchronized void print()
	{
		System.out.println("Input is :"+str);
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
			{
				num += ch;
			}
			else {
                if (!num.equals("")) 
                {
                    System.out.print(num + " ");
                    num = ""; 
                }
            }
        }

       
        if (!num.equals("")) 
        {
            System.out.print(num);
        }
			

	}
	
	public void run()
	{
		print();
	}
}

public class Question13 {
	public static void main(String[] args) {
		ExtractInt obj = new ExtractInt();
		obj.start();
	}

}
