package Question.pkg;
import java.util.Arrays;
import java.util.Scanner;

//Create a thread using the Thread class to rotate a square matrix 90 degrees clockwise
class Triangle extends Thread 
{
    private int matrix[][];

    public Triangle(int matrix[][]) 
    {
        this.matrix = matrix;
    }

    public void rotateSquare()
    {
        int n = matrix.length;
        int roMatrix[][] = new int[n][n];

       
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                roMatrix[j][n - 1 - i] = matrix[i][j];
            }
        }

       
        System.out.println("Rotated Matrix:");
        
        for (int[] row : roMatrix) 
        {
            System.out.println(Arrays.toString(row));
        }
    }

    public void run() {
        rotateSquare();
    }
}

public class Question03 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Triangle obj = new Triangle(matrix);
        obj.start();
    }
}

