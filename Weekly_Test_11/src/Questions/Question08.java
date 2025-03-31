package Questions;

//8)Given an array of integers, find all unique triplets in the array that sum to zero.

public class Question08 {
	
	public static void uniqueTriplets(int arr[])
	{
		int n = arr.length;
		
		System.out.println("Unique triplets in the arrays is:");
		for (int i=0;i<n-2;i++)
		{
			for (int j=i+1;j<n-1;j++)
			{
				for (int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k] == 0)
					{
						System.out.println(arr[i]+","+arr[j]+","+arr[k]+",");
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {-1, 0, 1, 2, -1, -4};
		uniqueTriplets(arr);
	}

}
