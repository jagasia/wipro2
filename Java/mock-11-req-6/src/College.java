import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class College{
	private String name;
	private String website;
	private String mobile;
	private String founder;
	private Integer numberOfDept;
	private String location;
	private Date startingDate;
	
	public College() {}

	public College(String name, String website, String mobile, String founder, Integer numberOfDept, String location,
			Date startingDate) {
		super();
		this.name = name;
		this.website = website;
		this.mobile = mobile;
		this.founder = founder;
		this.numberOfDept = numberOfDept;
		this.location = location;
		this.startingDate = startingDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public Integer getNumberOfDept() {
		return numberOfDept;
	}

	public void setNumberOfDept(Integer numberOfDept) {
		this.numberOfDept = numberOfDept;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}
	
	public static College createCollege(String detail) throws ParseException
	{
//		IIT Madras,http.iitm.ac.in,7845612390, iit ,16,Tamil Nadu,15-12-1959 
		String[] arr = detail.split(",");
		College college=new College();
		college.setName(arr[0]);
		college.setWebsite(arr[1]);
		college.setMobile(arr[2]);
		college.setFounder(arr[3]);
		college.setNumberOfDept(Integer.valueOf(arr[4]));
		college.setLocation(arr[5]);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		college.setStartingDate(sdf.parse(arr[6]));
		return college;
	}


	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		return String.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", name,website,mobile,founder,numberOfDept,location,sdf.format(startingDate));
	}
	
	static Map<String,Integer> calculateLocationCount(List<College> list)
	{
		Map<String,Integer> result=new TreeMap<>();
		for(College college:list)
		{
			String loc=college.getLocation();
			Integer count = result.getOrDefault(loc, 0);
			count++;
			result.put(loc, count);
		}
		return result;
	}
}
