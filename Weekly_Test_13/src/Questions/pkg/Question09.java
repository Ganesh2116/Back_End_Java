package Questions.pkg;

//9.Use nested try-catch to handle array index and arithmetic exceptions separately.
//Divide two array elements and catch both exceptions at the right level.


public class Question09 {
	
	public static void main(String[] args) 
	{
		
		int[] arr1 = {10, 20, 30};
	     int[] arr2 = {2, 0}; 

	     for (int i = 0; i < 3; i++)
	     {
	         try {
	        	 
	             try {
	                 int result = arr1[i] / arr2[i];
	                 System.out.println("Result of arr1[" + i + "] / arr2[" + i + "] = " + result);
	             } catch (ArithmeticException ae) {
	                 System.out.println("ArithmeticException at index " + i + ": " + ae.getMessage());
	             }
	             
	         } catch (ArrayIndexOutOfBoundsException aie) {
	             System.out.println("ArrayIndexOutOfBoundsException at index " + i + ": " + aie.getMessage());
	         }
	     }
	}

}
