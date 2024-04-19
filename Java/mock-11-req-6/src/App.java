import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of colleges:");
		int noOfCollege=sc.nextInt();
		List<College> list=new ArrayList<>();
		for(int  i=0;i<noOfCollege;i++)
		{
			String detail = sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			College college=College.createCollege(detail);
			list.add(college);
		}
		Map<String, Integer> map = College.calculateLocationCount(list);
		
		System.out.format("%-15s %s\n","Location","Count");
		for(Entry<String, Integer> e:map.entrySet())
		{
			System.out.format("%-15s %s\n",e.getKey(),e.getValue());
		}
		
	}

}
