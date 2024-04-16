import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		int denominator=sc.nextInt();
		boolean isFirst=true;
		boolean isFound=false;
		for(int i=0;i<=9;i++)
		{
			//replace middle char with i
			char temp=(char)(i+48);
//			System.out.println(temp);
			String str=""+input.charAt(0)+temp+input.charAt(2);
//			System.out.println(str);
			int numerator=Integer.parseInt(str);
			
			if(numerator%denominator==0)
			{
				isFound=true;
				if(!isFirst)
				{
					System.out.print(",");
				}
				System.out.print(numerator);
				isFirst=false;
			}
		}
		if(!isFound)
		{
			System.out.println(-1);
		}
	}

}
