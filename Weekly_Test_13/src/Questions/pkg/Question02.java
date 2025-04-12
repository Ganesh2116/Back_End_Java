package Questions.pkg;

//2.Find the maximum element in an array without using loops (use recursion).


class MaxEle
{
    int arr[] = {10, 35, 67, 89, 45, 23};

    public int findMax(int index, int currentMax) 
    {
        if (index == arr.length) {
            return currentMax;
        }
        if (arr[index] > currentMax) {
            currentMax = arr[index];
        }
        return findMax(index + 1, currentMax);
    }

    public void display() 
    {
        int max = findMax(0, arr[0]);
        System.out.println("Maximum Element is: " + max);
    }
}

public class Question02 {
	
	public static void main(String[] args) {
		MaxEle obj = new MaxEle();
		obj.display();
	}

}
