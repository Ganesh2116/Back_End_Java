package ArraysQUseingThread.pkg;
//4. Given an array A of positive integers. Your task is to find the leaders in the array. 
//An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.
//Input:
//n = 6
//A[] = {16,17,4,3,5,2}
//Output: 17 5 2

import java.util.Arrays;

class LeaderElement
{
	private int[] arr;
	private int size;
	
	public LeaderElement(int[] arr)
	{
		this.arr = arr;
		this.size = arr.length;
	}
	
	public void findLeader()
	{
		for(int i = 0; i < size; i++)
		{
			boolean isLeader = false;
			int leader = arr[i];
			for(int j=i; j < size; j++)
			{
				if(leader >= arr[j])
				{
					isLeader = true;
				}
				else
				{
					isLeader = false;
					break;
				}
			}
			if(isLeader)
				System.out.print(arr[i]+" ");
		}
	}
	
	public void display()
	{
		System.out.println(Arrays.toString(arr));
	}
}

class MyThread4 extends Thread
{
	private LeaderElement l4;
	
	public MyThread4(LeaderElement l4)
	{
		this.l4 = l4;
	}
	
	public void run()
	{
		System.out.println("Leader elements are : ");
		l4.findLeader();
	}
}


public class Question04 
{
	public static void main(String[] args) {
		int A[] = {16,17,4,3,5,2};
		
		LeaderElement l1 = new LeaderElement(A);
		
		MyThread4 t4 = new MyThread4(l1);
		
		t4.start();
	}
}
