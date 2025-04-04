package Question.pkg;
//Create a thread using the Thread class to perform row-wise addition of two matrices concurrently

class RowAddition extends Thread
{
	private int matrice[][];
	private int matrice1[][];
	private int result[][];
	private int row;
	
	public RowAddition(int matrice[][],int matrice1[][],int row,int result[][])
	{
		this.matrice = matrice;
		this.matrice1 = matrice1;
		this.result = result;
		this.row = row;
	}
	
	public void addtionsRowVal()
	{
		for (int col = 0; col < matrice[0].length; col++) 
		{
            result[row][col] = matrice[row][col] + matrice1[row][col];
        }
	}
	

	
	public void run()
	{
		this.addtionsRowVal();
		
	}
}
public class Question07 {
	public static void main(String[] args) {
		int matrix1[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
	        
	    int matrix2[][] = { {9, 8, 7}, {6, 5, 4},{3, 2, 1}};

	        int rows = matrix1.length;
	        int cols = matrix1[0].length;
	        int[][] result = new int[rows][cols];

	        Thread[] threads = new Thread[rows];
	        
	        for (int i = 0; i < rows; i++) 
	        {
	            threads[i] = new RowAddition(matrix1, matrix2,i,result);
	            threads[i].start();
	        }
	        
	    
	    		 System.out.println("Resultant Matrix After Row-wise Addition:");
	    	     for (int i = 0; i < rows; i++) 
	    	     {
	    	         for (int j = 0; j < cols; j++) 
	    	         {
	    	             System.out.print(result[i][j] + " ");
	    	         }
	    	         System.out.println();
	    	     }
	}

}
