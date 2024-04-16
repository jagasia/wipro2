import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppRegex2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String mobileNo=sc.nextLine();
//		//String class itself has matches() method
//		if(mobileNo.matches("[6-9]{1}[0-9]{9}"))
//		{
//			System.out.println("Valid");
//		}else
//		{
//			System.out.println("Invalid");
//		}
		
		
		if(Pattern.matches("[6-9]{1}[0-9]{9}", mobileNo))
		{
			System.out.println("Valid");
		}else
		{
			System.out.println("Invalid");
		}
	}

}
