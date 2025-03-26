package Questions.pkg;

//Create a custom exception OutOfStockException for an inventory system when stock is zero.


class  OutOfStockException extends Exception
{
	 OutOfStockException(String message)
	{
		super(message);
	}
}

public class Question20 {
	static void display(int stock) throws  OutOfStockException
	{
		if (stock == 0)
		{
			throw new  OutOfStockException("stock is zero");
		}
		else
		{
			System.out.println("Stock is :"+stock);
		}
	}
	public static void main(String[] args) {
		try {
			display(0);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
