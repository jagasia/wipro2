public class Employee
{
	private Integer id;
	private String name;
	private String department;
	private Integer salary;
	
	public Employee() {}

	public Employee(Integer id, String name, String department, Integer salary) throws InvalidIdException {
		super();
//		this.id = id;
		setId(id);
//		this.name = name;
		setName(name);
		this.department = department;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) throws InvalidIdException {
		if(id<0)
			throw new InvalidIdException("Id is invalid");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()<1)
			throw new InvalidNameException("Name is invalid");
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
		return "Employee [id=" + getId() + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}


	
}
