import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value 1");
		int value1=sc.nextInt();
		System.out.println("Enter Value 2");
		int value2=sc.nextInt();
		
		int x=Math.abs(value1);
		int y=Math.abs(value2);
		
		if(x<10 || x>99 || y<10 || y>99)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		//continue if it is valid range
		//we use xor here
		if(value1<0 ^ value2<0)
		{
			System.out.println("Correct");
		}else
		{
			System.out.println("Incorrect");
		}
	}

}
