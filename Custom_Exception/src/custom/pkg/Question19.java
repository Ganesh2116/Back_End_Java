package custom.pkg;
//Create an UnauthorizedAccessException if a user tries to access a restricted area without permission.

class UnauthorizedAccessException extends Exception
{
	UnauthorizedAccessException(String message)
	{
		super(message);
	}
}


public class Question19 {
 public static void accessRestrictedArea(boolean hasPermission) throws UnauthorizedAccessException {
     if (!hasPermission) {
         throw new UnauthorizedAccessException("Access Denied: You do not have permission to enter this area.");
     }
     System.out.println("Access Granted: Welcome to the restricted area.");
 }

 public static void main(String[] args) {
     try {
         accessRestrictedArea(false); 
     } catch (UnauthorizedAccessException e) {
    	 System.out.println(e);
         System.out.println(e.getMessage());
     }
 }
}
