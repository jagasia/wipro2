import java.util.Arrays;

public class App7Slice {
	public static int[] slice(int []array, int start, int end)
	{
		int []result=new int[end-start];
		for(int i=0,j=start;i<result.length;i++,j++)
		{
			result[i]=array[j];
		}
		return result;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		int[] result = slice(arr,3,6);
		System.out.println(Arrays.toString(result));
		
		String str="123456";
		System.out.println(str.substring(0,2));
	}
}
