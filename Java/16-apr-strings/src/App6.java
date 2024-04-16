import java.util.Scanner;

public class App6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		String str=str1.concat(str2);
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		sb.reverse();
		String reverse=sb.toString();
		int length=reverse.length();
		int mid=(length/2)/2;
		System.out.println(mid);
		System.out.println(reverse.substring(mid,length-length/2));
		System.out.println(("abcdefg".substring(3)).substring(0,3));
	}

}
