package Thread.pkg;

import java.util.Arrays;
import java.util.Scanner;

//3.Rotate it 90 Degree and store it in another matrix and then print it
class MatrixRotation extends Thread
{
	public void run()
	{
		Scanner sc = new Scanner(System.in);
	       
	       System.out.println("Enter row size in 2d");
	       int row = sc.nextInt();
	       
	       System.out.println("Enter col size in 2d");
	       int col = sc.nextInt();
	       
	       int arr[][] = new int[row][col];
	       int arr1[][] = new int[row][col];
	       for (int i =0;i<row;i++)
	       {
	    	   for(int j=0;j<col;j++)   
	    	   {
	    		   arr[i][j] = sc.nextInt();
	    	   }
	       }
	       
	       System.out.println("90 Degree rotation :");
	       
	       for (int i =0;i<row;i++)
	       {
	    	   int x = 0;
	    	   for(int j=col-1;j>=0;j--)   
	    	   {
	    		arr1[i][x++] = arr[j][i];
	    	   }
	    	   System.out.println();
	       }
	       
	       for (int i =0;i<row;i++)
	       {
	    	   for(int j=0;j<col;j++)   
	    	   {
	    		   System.out.print(arr1[i][j]+" ");
	    	   }
	    	   System.out.println();
	       }
	       
	}
}

public class Question03 {
	public static void main(String[] args) {
		MatrixRotation obj = new MatrixRotation();
		obj.start();
	}

}
