import java.util.Arrays;

public class App5 {
	public static void main(String[] args) {
		int arr[][]= {
				{1,2,3},
				{11,22,33,44,55},
				{100,200},
				{1000,2000,3000,4000}
		};
		
//		System.out.println(Arrays.deepToString(arr));
		//how do we loop this array?
		for(int row[]:arr)
		{
			boolean isFirst=true;
			for(int column:row)
			{
				if(!isFirst)
					System.out.print(",");
				System.out.print(column);
				isFirst=false;
			}
			System.out.println();
		}
	}
}
