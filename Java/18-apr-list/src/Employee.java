
public class Employee implements Comparable<Employee>
{
	private Integer id;
	private String name;
	private String department;
	private Integer salary;
	
	public Employee() {}

	public Employee(Integer id, String name, String department, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		if(id<0)
			throw new NumberFormatException("Invalid id");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		//how do you want to sort a list of Employee
		//by their id in asc order		0 -1 1
		//if a and b are employees, a.compareTo(b)
		//a is referred by "this"	and b is referred by "o"
//		return o.getId().compareTo(this.getId());
		return this.getId().compareTo(o.getId());
	}
	
}
