package Thread.pkg;
//5.Rotate it 270 Degree and store it in another matrix and then print it

import java.util.Scanner;

class Rotate extends Thread
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
	       
	       for (int i =row-1;i>=0;i--)
	       {
	    	   for(int j=0;j<col;j++)   
	    	   {
	    		   arr1[2-i][j] = arr[j][i];
	    	   }
	       }
	       
	       System.out.println("270 Degree matrix is :");
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

public class Question05 {
	
	public static void main(String[] args) {
		Rotate obj = new Rotate();
		obj.start();
	}

}
