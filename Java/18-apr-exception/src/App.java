import java.io.IOException;

class Bank
{
	public void withdraw(int amount) throws IOException
	{
		if(amount>30000)
		{
			throw new IOException("Amount cannot be > 30k");
		}else
		{
			System.out.println("Remember to collect the cash");
		}
	}
}
public class App {

	public static void main(String[] args) {
		Bank sbi=new Bank();
		try {
			sbi.withdraw(33000);
		} catch (IOException e) {
			System.out.println("Exception is handled");
			throw new NumberFormatException();
		}finally
		{
			System.out.println("this is finally");
		}
		System.out.println("Continue");
		
	}

}
