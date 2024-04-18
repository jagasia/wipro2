import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University {
	private String name;
	private List<College> collegeList;
	
	public University() {
		collegeList=new ArrayList<>();
	}
	
	
	public University(String name, List<College> collegeList) {
		super();
		this.name = name;
		this.collegeList = collegeList;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<College> getCollegeList() {
		return collegeList;
	}
	public void setCollegeList(List<College> collegeList) {
		this.collegeList = collegeList;
	}
	
	public void addCollegeToUniversity(College college) {
		//i should add a college to the university
		collegeList.add(college);
		System.out.println("College successfully added ");
	}
	public Boolean removeCollege(String name) {
		boolean isFound=false;
		//check if any college is found in the given name or not
//		for(int i=0;i<collegeList.size();i++)
//		{
//			College college = collegeList.get(i);
//			if(college.equals(name))
//			{
//				isFound=true;
//				//listen. If you remove an element inside a for-each loop,
//				//you may get ConcurrentModificatioException
//				//because, you are affecting the boundary condition of the collection
//				//let's see that error
//				collegeList.remove(college);
//			}
//		}
		
		//-------------using iterator to remove
		Iterator<College> it = collegeList.iterator();
		while(it.hasNext())
		{
			//use it.next only once inside the loop
			College college = it.next();
			if(college.getName().equals(name))
			{
				isFound=true;
				it.remove();
			}
			
		}
		
		
		return isFound;	
	}
	public void displayColleges() {
		//display all colleges
		if(collegeList.isEmpty())
		{
			System.out.println("No colleges to show");
			return;		//exit the current method
		}
		//if collegeList is not empty, lets display
		System.out.println("Colleges in "+name);
		System.out.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n", "Name","Website","Mobile","Founder","Number of Dept","Location","Starting Date");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		for(College c:collegeList)
		{
			System.out.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n", c.getName(),c.getWebsite(),c.getMobile(),c.getFounder(),c.getNumberOfDept(),c.getLocation(),sdf.format(c.getStartingDate()));
		}
	}

	
}
