package Question.pkg;

import java.util.Scanner;

//4. Create a thread using the Thread class to transpose a matrix in parallel  

class TransposeTriangle extends Thread
{
	private int matrix[][] ;
	public TransposeTriangle(int matrix[][])
	{
		this.matrix = matrix;
	}
	
	public void transpose()
	{
		int num = matrix.length;
		for (int i=0;i<num;i++)
		{
			for (int j=0;j<num;j++)
			{
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public void run()
	{
		System.out.println("Transpose matrix is: ");
		transpose();
	}
}
public class Question04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the row size");
		int row = sc.nextInt();
		
		System.out.println("Enter the col size");
		int col = sc.nextInt();
		
		int matrix[][] = new int[row][col];
		
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				matrix[i][j] = sc.nextInt(); 
			}
		}
		
		TransposeTriangle obj = new TransposeTriangle(matrix);
		obj.start();
	}

}
