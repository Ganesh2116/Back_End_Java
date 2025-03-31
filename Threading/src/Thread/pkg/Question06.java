package Thread.pkg;

//Q1.Given an array of N integers. Find the first element that occurs at least K number of times.
// 
//Example 1:
//Input :
//N = 7, K = 2
//A[] = {1, 7, 4, 3, 4, 8, 7}
//Output :
//

class NInterger extends Thread
{
	public void run()
	{
		int arr[] = {1, 7, 4, 3, 4, 8, 7};
		
		for (int i =0;i<arr.length;i++)
		{
			int count = 1;
			int k =2;
			for(int j =i+1;j<arr.length;j++)
			{
				if (arr[i] == arr[j])
				{
					count++;
				}
			}
			if (count >= k)
			{
				System.out.println("Arrays first element is :"+arr[i]);
				break;
			}
		}
	}
}

public class Question06 {
	public static void main(String[] args) {
		NInterger obj = new NInterger();
		obj.start();
	}
}
