package functions;

public class Armstrong {
	
	public static void main(String[] args) {
		int n= 153;
		int digits = (int) Math.log10(n)+1; 
		int sum = 0;
		for (int i=n;i>0;i=i/10)
		{
			int digit = i%10;
			sum += Math.pow(digit, digits);
		}
		
		if (sum == n)
		{
			System.out.println("This is armstrong");
		}
		else
		{
			System.out.println("This is not armstrong");
		}
	}

}
