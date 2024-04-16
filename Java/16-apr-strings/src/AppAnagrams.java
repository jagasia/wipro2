import java.util.Arrays;
import java.util.Scanner;

public class AppAnagrams {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input1=sc.next();
		String input2=sc.next();
		
		char[] arr1 = input1.toCharArray();
		Arrays.sort(arr1);
		String str1=new String(arr1);
		
		char[] arr2 = input2.toCharArray();
		Arrays.sort(arr2);
		String str2=new String(arr2);
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Anagram");
		}else
		{
			System.out.println("Not anagram");
		}
	}
}
