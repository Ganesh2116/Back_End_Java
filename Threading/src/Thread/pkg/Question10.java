package Thread.pkg;

import java.util.Arrays;

//Q5.Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K. The task is to find the element that would be at the k’th position of the final sorted array.


//Example 1:
//
//Input:
//arr1[] = {2, 3, 6, 7, 9}
//arr2[] = {1, 4, 8, 10}
//k = 5
//Output:
//6

class JoinArr extends Thread
{
	public void run()
	{
		int arr[] = {2, 3, 6, 7, 9};
		int arr1[] = {1, 4, 8, 10};
		int arr2[] = new int[arr.length+arr1.length];
		int x = 0;
		int k = 5;
		for(int i=0;i<arr.length;i++)
		{
			arr2[x++] = arr[i]; 
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			arr2[x++] = arr1[i]; 
		}
		
		Arrays.sort(arr2);
		
		System.out.println("Kth position element is :"+arr2[k-1]);
	}
}

public class Question10 {

	public static void main(String[] args) {
		JoinArr obj = new JoinArr();
		obj.start();
	}
}
