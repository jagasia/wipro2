import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char []arr=new char[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		
		int maxCount=1;
		char maxCountChar='\0';
		for(int i=0;i<n-1;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
//				System.out.printf("i=%c,j=%c\n",arr[i],arr[j]);
				if(arr[i]==arr[j])
				{
					count++;
					if(count>=maxCount)
					{
						maxCount=count;
						maxCountChar=arr[i];
					}
				}
			}
//			System.out.printf("%c is found %d times\n",arr[i],count);
		}
//		
		if(maxCount>1)
		{
			System.out.println(maxCountChar);
		}else
		{
			System.out.println(-1);
		}
	}

}
