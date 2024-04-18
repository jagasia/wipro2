import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		//suppose if salary is primitive int type, then
//		return o1.getSalary()-o2.getSalary();
		return o1.getSalary().compareTo(o2.getSalary());
	}

}
