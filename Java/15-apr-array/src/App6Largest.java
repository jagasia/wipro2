import java.util.Arrays;

public class App6Largest {
	public static void main(String[] args) {
		int arr[]= {121,22,13,214,515,65,1257,88,98};
//		to find largest number in an array
//		int max=0;
//		for(int element : arr)
//		{
//			if(element>max)
//			{
//				max=element;
//			}
//		}
//		
//		System.out.println(max);
		
		Arrays.sort(arr);
		int max=arr[arr.length-1];
		System.out.println(max);
	}
}
