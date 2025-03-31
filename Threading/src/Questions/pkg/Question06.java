package Questions.pkg;

//Q1.Wap enter a string and print it in a reverse order word by word.

class ReverseOrderWord extends Thread {
    public void reverse() {
        String str = "This is java reverse word by word";
        String words[] = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                System.out.print(words[i].charAt(j));
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    public void run() {
        reverse();
    }
}

public class Question06 {
    public static void main(String[] args) {
        ReverseOrderWord obj = new ReverseOrderWord();
        obj.start();
    }
}
