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
		sc.close();
		//now fix "1" in locations where towers are present in city array
		//for each tower, we need to put 1 in city at x and y
		for(int i=0;i<noOfTowers;i++)
		{
			int x=positions[i][0];
			int y=positions[i][1];
				
			//a tower covers 3 mts including tower location. 
//			so every adjacent location should be marked as 1
			
			//x +-1		x+0	x+1	,,,,,,,,,,,	y+-1	y+0	y+1
			//diagonal		x+1 y+1			x-1	y-1
			//diagonal		x+1 y-1			x-1	y+1
			
			//problem is 		index should not go out of bounds
			for(int m=-1;m<=1;m++)
			{
				for(int n=-1;n<=1;n++)
				{
//					System.out.printf("m=%d\tn=%d\n",m,n);
					int x1=x+m;
					int y1=y+n;
					if(x1>=0 && x1<sideLength && y1>=0 && y1<sideLength)
					{
						city[x1][y1]=1;
					}
				}
			}
			
			
			
		}
		
		//check city now
//		for(int i=0;i<sideLength;i++)
//		{
//			for(int j=0;j<sideLength;j++)
//			{
//				System.out.print(city[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		//count the 0s in city array. If no 0s then Yes. Else No and display the count
		int zeroCount=0;
		for(int i=0;i<sideLength;i++)
			for(int j=0;j<sideLength;j++)
				if(city[i][j]==0)	zeroCount++;
		
		System.out.println((zeroCount>0)?"No\n"+zeroCount:"Yes");
	}

}
