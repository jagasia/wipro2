import java.util.Arrays;

public class App2 {

	public static void main(String[] args) {
//		int x[10];		//c, c++ but not in java
		int []arr=new int[5];
		arr[0]=100;
		arr[1]=20;
		arr[2]=30;
		arr[3]=15;
		arr[4]=45;
		
		int []arr2=arr;
		
		//can we increase the size of arr?
		
		arr=new int[10];	//what happens here?
		//we have created a new array and its reference is assigned to arr
		
		
		System.out.println(Arrays.toString(arr2));
	}

}
