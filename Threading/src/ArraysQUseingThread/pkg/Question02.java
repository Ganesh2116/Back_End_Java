package ArraysQUseingThread.pkg;

//2.Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.

class Trip 
{
	int arr[];
	int x;
	public Trip(int arr[],int x)
	{
		this.arr = arr;
		this.x = x;
		
	}
	
	public void setFindTriplet()
	{
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				for (int k=j+1;k<arr.length;k++)
				{
					if (arr[i]+arr[j]+arr[k] == x)
					{
						System.out.println("tripet is : "+arr[i] +" "+ arr[j] +" " +arr[k]);
					}
				}
			}
		}
	}
}



class Triplet extends Thread
{
	Trip obj;
	
	public Triplet(Trip obj)
	{
		this.obj = obj;
	}
	
	public void run()
	{
		obj.setFindTriplet();;
	}
}


public class Question02 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int x = 16;
		Trip ob = new Trip(arr,x);
		
		Triplet obj = new Triplet(ob);
		obj.start();
	}
	

}
