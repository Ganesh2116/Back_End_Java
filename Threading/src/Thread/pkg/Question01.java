package Thread.pkg;

import java.util.Scanner;

//Print it by using predefine method

class MyThread extends Thread {
    
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
       
       System.out.println("Arrays is:");
       for (int i =0;i<row;i++)
       {
    	   for(int j=0;j<col;j++)   
    	   {
    		   System.out.print(arr[i][j]+ " ");
    	   }
    	   System.out.println();
       }
      
    }
}

public class Question01 {
	public static void main(String[] args) {
		MyThread obj =  new MyThread();
		obj.start();
	}
}
