import java.util.Scanner;

public class Main {

	static Boolean validateWebsite(String website)
	{
		String exp="http(s)?://(www[.])?[A-Za-z]+([.]{1}[a-z]{2,6}?){1,2}";
		return website.matches(exp);
	}
	static Boolean validateMobile(String mobileNo)
	{
		String exp="[+]91\\d{10}";
		return mobileNo.matches(exp);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Validate Website\r\n"
				+ "2.Validate Mobile number\r\n"
				+ "Enter your choice:\r\n"
				+ "");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the Website to be validated:");
			String website=sc.nextLine();
			if(website.equals(""))
				website=sc.nextLine();
			if(validateWebsite(website))
			{
				System.out.println("Website is valid");
			}else
			{
				System.out.println("Website is invalid");
			}
			break;
		case 2:
			System.out.println("Enter the Mobile no. to be validated:");
			String mobileNo=sc.nextLine();
			
			if(mobileNo.equals(""))
				mobileNo=sc.nextLine();
			if(validateMobile(mobileNo))
			{
				System.out.println("Mobile number is valid");
			}
			else
			{
				System.out.println("Mobile number is invalid");
			}
			break;			
		}
		
	}

}
