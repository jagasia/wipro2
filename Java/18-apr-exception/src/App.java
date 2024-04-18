class Bank
{
	public void withdraw(int amount)
	{
		if(amount>30000)
		{
			throw new NumberFormatException("Amount cannot be > 30k");
		}else
		{
			System.out.println("Remember to collect the cash");
		}
	}
}
public class App {

	public static void main(String[] args) {
		Bank sbi=new Bank();
		try
		{
			sbi.withdraw(31000);
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println("Continue");
		
	}

}
