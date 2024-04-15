import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer size=sc.nextInt();
		Integer arr[]=new Integer[size];
		for(Integer i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}	
		Integer n=sc.nextInt();
			
		
		Integer []temp=Arrays.copyOfRange(arr, 0, size);
		
		Arrays.sort(temp);
		
		Integer smallest[]=Arrays.copyOfRange(temp, 0, n);
		
		List<Integer> inputs = Arrays.asList(smallest);
		boolean isFirst=true;
		for(Integer element : arr)
		{
			if(inputs.contains(element))
			{
				if(!isFirst)
					System.out.print(" ");
				System.out.print(element);
				isFirst=false;
			}
		}
		
	}

}
