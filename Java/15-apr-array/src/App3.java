import java.util.Arrays;
import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		int arr[];
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		arr=new int[n];
		System.out.println("we have created an array of size "+n);
		System.out.println(Arrays.toString(arr));
	}

}
