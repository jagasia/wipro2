import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		List<Employee> empList=new ArrayList<>();
		for(int i=0;i<no;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			String[] arr = detail.split(",");
			Employee employee=new Employee(Integer.valueOf(arr[0]), arr[1], arr[2], Integer.valueOf(arr[3]));
			empList.add(employee);
		}
		
		Collections.sort(empList, new EmployeeSalaryComparator());
		
		for(Employee e:empList)
			System.out.println(e);
	}

}
