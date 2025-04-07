package Weekly_Questions;

import java.util.Scanner;

/*
4. Array Coding – Second Largest Element:
Write a Java program that finds the second largest element in an integer array. The program should handle the
 case where the array has fewer than two distinct elements.
 */
public class Question04 {
	public static void secondLargestNum(int arr[])
	{
		int max = 0;
		int smax = 0;
		for (int i=0;i<arr.length;i++)
		{
			if (max < arr[i])
			{
				max = arr[i];
			}
			else if (arr[i] != max && max > arr[i])
			{
				smax = arr[i];
			}
		}
		
		System.out.println("Second max element is :"+smax);
	}
	
	public static void main(String[] args) {
		int arr[] = {10,20,6,5,84,5,1,2,45,46};
		
		secondLargestNum(arr);
		
	}

}
