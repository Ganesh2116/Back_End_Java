package ArraysQUseingThread.pkg;
/*
3.Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise direction) by D steps, where D is a positive integer.
Input:
N = 5, D = 2
arr[] = {1,2,3,4,5}
Output: 3 4 5 1 2
 */
import java.util.Arrays;

class RotateAntiClockwise
{
	private int[] arr;
	private int size;
	private int step; 
	
	public RotateAntiClockwise(int[] arr, int step)
	{
		this.arr = arr;
		this.size = arr.length;
		this.step = step;
	}
	
	public void rotateAnticlockWise()
	{
		for(int j = 1; j <= step; j++)
		{
			int first = arr[0];
			for(int i = 0; i < size-1; i++)
			{
				arr[i] = arr[i+1];
			}
			arr[size-1] = first;
		}
	}
	
	public void display()
	{
		System.out.println(Arrays.toString(arr));
	}
}

class MyThread3 extends Thread
{
	private RotateAntiClockwise rc3;
	
	public MyThread3(RotateAntiClockwise rc)
	{
		this.rc3 = rc;
	}
	
	public void run()
	{
		System.out.println("Before rotation : ");
		rc3.display();
		rc3.rotateAnticlockWise();
		System.out.println("After rotation : ");
		rc3.display();
	}
}

public class Question03 
{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int step = 2;
		
		RotateAntiClockwise rc = new RotateAntiClockwise(arr, step);
		
		MyThread3 t3 = new MyThread3(rc);
		
		t3.start();
	}
}
