import java.util.Arrays;

public class App8Slice2 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int[] result = Arrays.copyOfRange(arr, 3, 6);
		System.out.println(Arrays.toString(result));
	}

}
