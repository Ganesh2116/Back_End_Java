package Questions.pkg;
//Q5.Wap enter a string in lowercase now you have to convert every first character of the word in upper case. 

class ConvertFirstCharUppercase extends Thread {
    public void run() {
        String str = "this is java program";
        String words[] = str.split(" ");
        StringBuffer newStr = new StringBuffer("");

        for (int i = 0; i < words.length; i++) 
        {
            char ch = Character.toUpperCase(words[i].charAt(0));
            newStr.append(ch).append(words[i].substring(1)).append(" ");
        }

        System.out.println("Now String is: " + newStr.toString().trim());
    }
}

public class Question10 {
    public static void main(String[] args) {
        ConvertFirstCharUppercase obj = new ConvertFirstCharUppercase();
        obj.start();
    }
}
