package Questions.pkg;
//Write a Java program to handle NullPointerException when trying to call a method on a null reference.

public class Question03 {

    public static void print() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) { 
            System.out.println("NullPointerException caught: " + e);
        }
    }

    public static void main(String[] args) {
        print();
    }
}
