package Questions;

import java.util.Arrays;

//9)Write a Java program to merge two sorted arrays without using extra space.

public class Question09 {
	
	public static void mergeArrays(int arr[],int arr1[])
	{
		Arrays.sort(arr);
		Arrays.sort(arr1);
		int arr2[] = new int[arr.length+arr1.length];
		int x = 0;
		
		for (int i=0;i<arr.length;i++)
		{
			arr2[x++] = arr[i];
		}
		
		for (int i=0;i<arr1.length;i++)
		{
			arr2[x++] = arr1[i];
		}
		
		System.out.println("Merge arrays is :"+Arrays.toString(arr2));
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int arr1[] = {5,8,9,6,};
		mergeArrays(arr, arr1);
	}

}
