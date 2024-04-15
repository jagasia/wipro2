import java.util.Arrays;

public class App9Reverse {
	public static int[] reverse(int []input)
	{
		int rev[]=new int[input.length];
		for(int i=0,j=input.length-1;j>=0;j--,i++)
		{
			rev[i]=input[j];
		}
		return rev;
	}
	public static void main(String[] args) {
		int arr[]= {100,12,31,24,52,86,78,48,9};
		//reverse is not descending. it is reverse of the original order
		
		int[] result = reverse(arr);
		System.out.println(Arrays.toString(result));
		
	}
}
