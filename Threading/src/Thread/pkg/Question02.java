package Thread.pkg;

import java.util.Arrays;
import java.util.Scanner;

//2.Print it without using predefine methos

class MyThrea extends Thread {
    
    public void run() {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter row size in 2d");
       int row = sc.nextInt();
       
       System.out.println("Enter col size in 2d");
       int col = sc.nextInt();
       
       int arr[][] = new int[row][col];
       
       for (int i =0;i<row;i++)
       {
    	   for(int j=0;j<col;j++)   
    	   {
    		   arr[i][j] = sc.nextInt();
    	   }
       }
       System.out.println("Arrays is"+Arrays.deepToString(arr));
      
    }
}

public class Question02 {
	public static void main(String[] args) {
		MyThrea obj =  new MyThrea();
		obj.start();
	}
}

