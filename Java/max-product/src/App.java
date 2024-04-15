import java.util.Scanner;

public class App {

	public static boolean containsNumber(int arr[],int num)
	{
		boolean isFound=false;
		for(int x : arr)
		{
			if(x==num)
			{
				isFound=true;
				break;
			}
		}
		return isFound;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//--------------------
		//get all possible combination of product
		int maxProduct=-1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
//				System.out.printf("i=%d\tj=%d\n",i,j);
				int product=arr[i]*arr[j];
				//check if this product is found as an element in the array
				if(containsNumber(arr, product))
				{
					if(product>maxProduct)
					{
						maxProduct=product;
					}
				}
			}
		}
		
		System.out.println(maxProduct);
	}

}
