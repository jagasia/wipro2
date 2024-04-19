import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of user scores:");
		int n=sc.nextInt();
		List<UserScore> scoreList=new ArrayList<>();
		List<User> userList = User.prefill();
		List<Course> courseList = Course.prefill();
		for(int i=0;i<n;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			
//			95.2,Harry,JavaScript
			String[] arr = detail.split(",");
			Double completionPercentage=Double.valueOf(arr[0]);
			String userName=arr[1];
			User user=null;
			for(User u:userList)
			{
				if(u.getName().equals(userName))
				{
					user=u;
					break;
				}
			}
			String courseName=arr[2];
			Course course=null;
			for(Course c : courseList)
			{
				if(c.getName().equals(courseName))
				{
					course=c;
					break;
				}
			}
			
			UserScore us=new UserScore(completionPercentage, user, course);
			scoreList.add(us);
		}
		Map<String, UserScore> result = UserScore.getTopPerformer(scoreList);
		System.out.format("%-15s %s\n","Course","Top performer");
		for(Entry<String, UserScore> e:result.entrySet())
		{
			System.out.format("%-15s %s\n",e.getKey(),e.getValue());
		}
	}

}
