import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class App3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		Set<Employee> empSet=new TreeSet<>(new EmployeeSalaryComparator());
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
