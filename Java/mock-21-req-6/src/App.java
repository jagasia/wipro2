import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of purchases:");
		int n=sc.nextInt();
		List<User> userList = User.prefill();
		List<Purchase> purchaseList=new ArrayList<>();
		for(int i=0;i<n;i++) {
//			1,750,FIRST,05-06-2018,Rob
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			String[] arr = detail.split(",");
			Purchase p=new Purchase();
			p.setId(Integer.valueOf(arr[0]));
			p.setPrice(Double.valueOf(arr[1]));
			p.setCouponCode(arr[2]);
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			p.setPurchaseDate(sdf.parse(arr[3]));
			String userName=arr[4];
			//find the user by name
			for(User u : userList)
			{
				if(u.getName().equals(userName))
				{
					p.setUser(u);
					u.getPurchaseList().add(p);
					break;
				}
			}
		}
		System.out.println("Enter the month:");
		String month=sc.next();
		User result = User.getValuableUser(userList, month);
		System.out.println("The valuable user of the month June is "+result.getName());
	}

}
