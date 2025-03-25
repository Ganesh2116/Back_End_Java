package custom.pkg;
//Write a program that throws a NegativeSalaryException if a salary input is negative.

class  NegativeSalaryException extends  Exception
{
	 NegativeSalaryException(String message)
	 {
		 super(message);
	 }
}
public class Question10 {
	
	public static void checkSal(int sal) throws  NegativeSalaryException
	{
		if (sal < 0)
		{
			throw new  NegativeSalaryException("invaild sal");
		}
		else
		{
			System.out.println("salary is :"+sal);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkSal(-5000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
