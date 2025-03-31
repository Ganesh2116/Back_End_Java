package Questions;

//7)Write a program to find the second largest element in an unsorted array without sorting it.

public class Question07 {
	
	public static void secondLargestNum(int arr[])
	{
		int max = 0;
		int smax = 1;
		
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i] > max)
			{
				smax = max;
				max = arr[i];
			}
			else if (arr[i] >smax && arr[i] != max)
			{
				smax = arr[i];
			}
		}
		System.out.println("Second Max is :"+smax);
	}
	public static void main(String[] args) {
		int arr[] = {9,5,6,7,8,3,1,2,4};
		secondLargestNum(arr);
	}

}
