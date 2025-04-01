package ArraysQUseingThread.pkg;

import java.util.Arrays;

//1.Given an array, rotate the array by one position in clock-wise direction.
//Input:
//N = 5
//A[] = {1, 2, 3, 4, 5}

class ClockWise 
{
	private int arr[];
	private int size;
	
	public ClockWise(int arr[])
	{
		this.arr = arr;
		this.size = arr.length;
	}
	
	public void rotate()
	{
		
		
		int last = arr[size-1];
		for (int i=size-1;i>0;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = last;	
	}
	
	public void display()
	{
		System.out.println(Arrays.toString(arr));
	}
	
}


class Clock_Wise_Thread extends Thread
{
	private ClockWise obj;
	
	public  Clock_Wise_Thread(ClockWise obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		System.out.println("Before rotate");
		obj.display();
		System.out.println("After rotate");
		obj.rotate();
		obj.display();
		
	}
}

public class Question01 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		ClockWise obj = new ClockWise(arr);
		
		Clock_Wise_Thread ob = new Clock_Wise_Thread(obj);
		ob.start();
		
	}

}
