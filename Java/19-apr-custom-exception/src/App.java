
public class App {

	public static void main(String[] args) {
		Employee raja=new Employee();
		try {
			raja.setId(-1);
		} catch (InvalidIdException e) {
			System.out.println(e.getMessage()+"\nreplacing id as 0");
			try {
				raja.setId(0);
			} catch (InvalidIdException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		try
		{
			raja.setName("");
		}catch(InvalidNameException e)
		{
			System.out.println(e.getMessage()+"\nreplacing name as unknown");
			raja.setName("unknown");
		}
		System.out.println(raja);
	}

}
