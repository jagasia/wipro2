import java.util.HashSet;
import java.util.Collections;
import java.util.Set;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		Set<Employee> empSet=new HashSet<>();
		for(int i=0;i<no;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			String[] arr = detail.split(",");
			Employee employee=new Employee(Integer.valueOf(arr[0]), arr[1], arr[2], Integer.valueOf(arr[3]));
			empSet.add(employee);
		}
		
		
		for(Employee e:empSet)
			System.out.println(e);
	}

	

}
