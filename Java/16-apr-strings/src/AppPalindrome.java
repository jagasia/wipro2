import java.util.Scanner;

public class AppPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		//trim will remove only prefix and suffix spaces. Not in between
		input=input.replaceAll(" ", "");
		System.out.println(input);
		StringBuilder sb=new StringBuilder(input);
		System.out.println(sb);
//		sb.append(input);
		sb.reverse();
		String reverse=sb.toString();
		System.out.println(reverse);
		if(input.equalsIgnoreCase(reverse))
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not palindrome");
		}
	}

}
