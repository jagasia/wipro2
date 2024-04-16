import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		int index=sc.nextInt();
		if(index<0)
		{
			System.out.println("Invalid");
			System.exit(0);
		}
		
		System.out.println(input.charAt(index%input.length()));
	}

}
