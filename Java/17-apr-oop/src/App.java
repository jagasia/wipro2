
public class App {

	public static void main(String[] args) {
		Employee.display();
		Employee raja=new Employee();
		Employee suresh=new Employee();
		
		raja.associateId=1;
		raja.name="Raja";
		raja.companyName="Wipro";
		
		suresh.companyName="Wipro Limited";
		
		System.out.println(suresh.associateId);
		System.out.println(suresh.name);
		System.out.println(suresh.companyName);
		System.out.println(raja.companyName);
		
		System.out.println(Employee.companyName);
	}

}
