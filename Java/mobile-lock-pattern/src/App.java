import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int screenWidth=sc.nextInt();
		int noOfPoints=sc.nextInt();
		int [][]points=new int[noOfPoints][2];
		for(int i=0;i<noOfPoints;i++)
		{
			points[i][0]=sc.nextInt();
			points[i][1]=sc.nextInt();
		}
		sc.close();
		
		//your code here
		//start from first point, compare with next point.
		for(int i=0;i<noOfPoints-1;i++)
		{
//			System.out.printf("%d,%d compared with %d,%d\n",points[i][0],points[i][1],points[i+1][0],points[i+1][1]);
			int x1=points[i][0];
			int y1=points[i][1];
			
			int x2=points[i+1][0];
			int y2=points[i+1][1];
			
			//absolute difference between them must be maximum 1
			if(Math.abs(x1-x2)>1 || Math.abs(y1-y2)>1)
			{
				System.out.println("Invalid");
				System.exit(0);
			}
			
			
		}
		//check coverage
		int coverage=(int) (100*(float)noOfPoints/screenWidth);
		if(coverage>75)
		{
			System.out.println("Excellent");
		}else if(coverage>50)
		{
			System.out.println("Good");
		}else if(coverage>25)
		{
			System.out.println("Average");
		}
		else
		{
			System.out.println("Poor");
		}
		
		
	}

}
