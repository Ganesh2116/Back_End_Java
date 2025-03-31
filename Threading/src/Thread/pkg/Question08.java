package Thread.pkg;

//Q3.Given an array A of n positive numbers. The task is to find the first Equilibrium Point in an array. 
//Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
//
//Note: Retun the index of Equilibrium point. (1-based index)
//
//Example 1:
//
//Input: 
//n = 5 
//A[] = {1,3,5,2,2} 
//Output: 3

class PositiveNum extends Thread
{
	public void run()
	{
		int arr[] = {1,3,5,2,2};
		for (int i=0;i<arr.length;i++)
		{
			int lsum = 0;
			int rsum = 0;
			for (int j=0;j<=i;j++)
			{
				lsum += arr[j];
			}
			
			for (int j=i;j<arr.length;j++)
			{
				rsum += arr[j];
			}
			
			
			if (lsum == rsum)
			{
				System.out.println("first Equilibrium point index is:"+(i+1));
				break;
			}
		}
	}
}

public class Question08 {
	
	public static void main(String[] args) {
		PositiveNum obj = new PositiveNum();
		obj.start();
	}

}
