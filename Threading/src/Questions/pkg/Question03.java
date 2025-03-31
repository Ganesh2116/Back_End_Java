package Questions.pkg;

//Q11.Wap enter a string and find the percentage of uppercase, lowercase, digits and special characters in a string.
import java.util.Scanner;

class CharPercentageCalculator extends Thread {
    private String str;
    private int totalLength;
    private int upperCount = 0;
    private int	lowerCount = 0; 
    private int digitCount = 0; 
    private int specialCount = 0;

    public CharPercentageCalculator(String str, int totalLength) {
        this.str = str;
        this.totalLength = totalLength;
    }

    public void run() {
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialCount++;
            }
        }

        System.out.printf("Uppercase Letters: %.2f%%\n", (upperCount * 100.0 / totalLength));
        System.out.printf("Lowercase Letters: %.2f%%\n", (lowerCount * 100.0 / totalLength));
        System.out.printf("Digits: %.2f%%\n", (digitCount * 100.0 / totalLength));
        System.out.printf("Special Characters: %.2f%%\n", (specialCount * 100.0 / totalLength));
    }
}

public class Question03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int totalLength = input.length();
        
        CharPercentageCalculator calculator = new CharPercentageCalculator(input, totalLength);
        calculator.start();
    
    }
}

