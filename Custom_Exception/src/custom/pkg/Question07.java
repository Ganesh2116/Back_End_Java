package custom.pkg;

//Create a ProductNotFoundException for an e-commerce application if the product ID is invalid.


class ProductNotFoundException extends Exception
{
	ProductNotFoundException(String message)
	{
		super(message);
	}
}

public class Question07 {
	
	public static void productIdCheck(int productId) throws ProductNotFoundException
	{
		if (productId == 0 || productId <0)
		{
			throw new ProductNotFoundException("Enter vaild product id");
		}
		else
		{
			System.out.println("Product id is:"+productId);
		}
	}
	
	public static void main(String[] args) {
		try {
			productIdCheck(0);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
