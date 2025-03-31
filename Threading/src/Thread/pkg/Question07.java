package Thread.pkg;

//Q2.Given an array A of positive integers. Your task is to find the leaders in the array. 
//An element of array is leader if it is greater than or equal to all the elements to its right side
//. The rightmost element is always a leader. 
//
//Example 1:
//
//Input:
//n = 6
//A[] = {16,17,4,3,5,2}
//Output: 17 5 2

class PositiveIntergers extends Thread
{
	public void run()
	{
		int arr[] = {16,17,4,3,5,2};
		
		System.out.println("Output is:");
		for (int i =0;i<arr.length;i++)
		{
			int count =0;
			for(int j =i+1;j<arr.length;j++)
			{
				if (arr[i] <= arr[j])
				{
					count++;
				}
			}
			if (count == 0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		}
}

public class Question07 {
	public static void main(String[] args) {
		PositiveIntergers obj = new PositiveIntergers();
		obj.start();
	}

}
