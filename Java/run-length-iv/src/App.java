import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //no. of elements in array
		int arr[]=new int[n];
		//get n inputs
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int count=0;
		int maxCount=0;
		int startIndex=-1;
		int maxStartIndex=-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
				if(count==1)
				{
					//is a beginning
					startIndex=i;
				}
				//check if count> maxCount, if yes, then update maxCount
				if(count>maxCount)
				{
					maxCount=count;
					maxStartIndex=startIndex;
				}
//				System.out.printf("element=%d, count=%d, maxCount=%d, startIndex=%d\n",arr[i], count, maxCount, startIndex);
			}else
			{
				count=0;
			}
		}
		
		System.out.println(maxCount);
		System.out.println(maxStartIndex);
	}

}
