package Thread.pkg;

import java.util.Arrays;

//Q4.You are given two arrays, A and B, of equal size N. The task is to find the minimum value of A[0] * B[0] + A[1] * B[1] + .... + A[N-1] * B[N-1], where shuffling of elements of arrays A and B is allowed.
//
//
//Example 1:
//Input:
//N = 3 
//A[] = {3, 1, 1}
//B[] = {6, 5, 4}
//Output:
//23


class MinValues extends Thread
{
	public void run()
	{
		int A[] = {3, 1, 1};
		int B[] = {6, 5, 4};
		
		Arrays.sort(A);
		Arrays.sort(B);
		int sum =0;
		for (int i =0;i<A.length;i++)
		{
			sum += A[i]*B[B.length-i-1];
		}
		
		System.out.println("Sum is:"+sum);
	}
}

public class Question09 {
	
	public static void main(String[] args) {
		MinValues obj = new MinValues();
		obj.start();
	}

}
