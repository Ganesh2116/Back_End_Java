package custom.pkg;

class AgeNotVaild extends Exception
{
	AgeNotVaild(String message)
	{
		super(message);
	}
}
public class CustomAge {
	
	static public void checkAge(int age) throws AgeNotVaild
	{
		if (age<18)
		{
			throw new AgeNotVaild("age shoulb be greater then 18");
		}
		else
		{
			System.out.println("vaild age");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkAge(0);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
