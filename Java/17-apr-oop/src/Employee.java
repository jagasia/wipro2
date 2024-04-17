
public class Employee {
	Integer associateId;
	String name;
	static String companyName;
	final int MAX_SCORE=0;
	
	public static void display()
	{		
//		associateId=1;	not accessible
//		name="Jag";		not accessible
		//because, this static method can be
		//called, even before any object of
		//Employee is created
		companyName="Wipro";	//allowed
		//a static method can
		//access only static members of the class
		Employee ram=new Employee();
		ram.associateId=11;
		ram.name="Ram";
		
		System.out.println("This is a static method of EMployee");
	}
}
