import java.util.Scanner;

public class App {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ticketNo=sc.nextInt();
		
		//get the String version of ticketNo
//		String str=String.valueOf(ticketNo);
		if(isPalindrome(ticketNo) && isEvenSum(ticketNo))
		{
			System.out.println("Winner");
		}else
		{
			System.out.println("Not a winner");
		}
		
	}
	
	private static boolean isEvenSum(int ticketNo)
	{
		//% and / approach
		int temp=ticketNo;
		int digitSum=0;
		while(temp>0)
		{
			int digit=temp%10;
			digitSum+=digit;
			temp/=10;
		}
		return (digitSum%2==0);
			
	}

	private static boolean isPalindrome(int ticketNo) {
		String str=ticketNo+"";
		//How to get reverse of a String? StringBuilder/ StringBuffer
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		sb.reverse();
		String reverseStr=sb.toString();
		return str.equals(reverseStr);
	}

}
