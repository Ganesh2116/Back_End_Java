package Thread.pkg;
//4.Rotate it 180 Degree and store it in another matrix and then print it

import java.util.Arrays;
import java.util.Scanner;

class Rotation extends Thread
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
	    	   for(int j=col-1;j>=0;j--)   
	    	   {
	    		arr1[2-i][2-j] = arr[j][i];
	    	   }
	    	   System.out.println();
	       }
	      
	       System.out.println("180 Degree roration");
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
public class Question04 {
	public static void main(String[] args) {
		Rotation obj = new Rotation();
		obj.start();
	}

}
