package Questions.pkg;

//Q4.Wap enter a string and sort each word of string in accending and decending order by the length of each word.


import java.util.Scanner;

class SortWordsByLength extends Thread {
    private String str;

    public SortWordsByLength(String str) {
        this.str = str;
    }

    public void run() {
        String[] words = str.split(" ");
        
        
        for (int i = 0; i < words.length - 1; i++) 
        {
            for (int j = i + 1; j < words.length; j++)
            {
                if (words[i].length() > words[j].length()) 
                {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("Ascending Order by Length: " + String.join(" ", words));
        
        
        for (int i = 0; i < words.length - 1; i++) 
        {
            for (int j = i + 1; j < words.length; j++) 
            {
                if (words[i].length() < words[j].length())
                {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("Descending Order by Length: " + String.join(" ", words));
    }
}

public class Question09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        SortWordsByLength sorter = new SortWordsByLength(input);
        sorter.start();
        
        
    }
}

