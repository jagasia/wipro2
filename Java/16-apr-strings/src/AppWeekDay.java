import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AppWeekDay {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		Date dt=sdf.parse(input);
		
		SimpleDateFormat sdf2=new SimpleDateFormat("EEEE");
		System.out.println(sdf2.format(dt));
	}

}
