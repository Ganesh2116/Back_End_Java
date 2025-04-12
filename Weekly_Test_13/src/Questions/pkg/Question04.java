package Questions.pkg;

//4.Reverse each word in a sentence individually.
//Input: "Java is fun" → Output: "avaJ si nuf"

class ReverseEachWord
{
	 String str = "Java is fun";

	    public void display() 
	    {
	        String nstr[] = str.split(" ");

	        System.out.println("Output is :");

	        for (int i = 0; i < nstr.length; i++) 
	        {
	            for (int j = nstr[i].length() - 1; j >= 0; j--) 
	            {
	                System.out.print(nstr[i].charAt(j));
	            }
	            System.out.print(" "); 
	        }
	    }
}

public class Question04 {
	public static void main(String[] args) {
		ReverseEachWord obj = new ReverseEachWord();
		obj.display();
	}

}
