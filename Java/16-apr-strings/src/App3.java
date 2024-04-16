import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		//check if the input is a valid ip address or not
		//ipv4 only		ex:	127.0.0.1	
		//each portion can range between 0 and 255
		String exp="^(\\d|[1-9]\\d|1\\d\\d|2([0-4]\\d|5[0-5]))\\.(\\d|[1-9]\\d|1\\d\\d|2([0-4]\\d|5[0-5]))\\.(\\d|[1-9]\\d|1\\d\\d|2([0-4]\\d|5[0-5]))\\.(\\d|[1-9]\\d|1\\d\\d|2([0-4]\\d|5[0-5]))$";
		System.out.println(input.matches(exp));
	}

}
