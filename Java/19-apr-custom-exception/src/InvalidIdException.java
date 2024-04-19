
public class InvalidIdException extends Exception	//checked exception
{
//whenever we throw an exception object, we can pass message as argument
	//	throw new InvalidIdException("......");
	public InvalidIdException(String message)
	{
		super(message);
	}
	
	//they may handle using any of the super class
	//		catch(Exception ex)	{		ex.getMessage();
}
