import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value 1:");
		int value1=sc.nextInt();
		System.out.println("Enter Value 2:");
		int value2=sc.nextInt();
		if(value1<0 ||value1>6 ||value2<0 ||value2>6)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		//program continues, if value1 and value2 are valid
		int result=value1+value2;
		
		if(value1==value2)
		{
			result*=2;
		}
		
		System.out.println("The points scored is "+result);
	}
}
