import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App5Date {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		Date dt=sdf.parse(input);
		System.out.println(sdf.format(dt));
	}

}
