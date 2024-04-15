import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sideLength=sc.nextInt();		//5
		int city[][]=new int[sideLength][sideLength];
		int noOfTowers=sc.nextInt();		//3
		int positions[][]=new int[noOfTowers][2];
		for(int i=0;i<noOfTowers;i++)
		{
			//i dont need j loop just for 2 co ordinates
			positions[i][0]=sc.nextInt();
			positions[i][1]=sc.nextInt();
		}
		//now fix "1" in locations where towers are present in city array
		//for each tower, we need to put 1 in city at x and y
		for(int i=0;i<noOfTowers;i++)
		{
			int x=positions[i][0];
			int y=positions[i][1];
			city[x][y]=1;	
			//a tower covers 3 mts including tower location. 
//			so every adjacent location should be marked as 1
			
			//x +-1		x+0	x+1	,,,,,,,,,,,	y+-1	y+0	y+1
			//diagonal		x+1 y+1			x-1	y-1
			//diagonal		x+1 y-1			x-1	y+1
			
			//problem is 		index should not go out of bounds
			
			
			
			
		}
		
		//check city now
		for(int i=0;i<sideLength;i++)
		{
			for(int j=0;j<sideLength;j++)
			{
				System.out.print(city[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
