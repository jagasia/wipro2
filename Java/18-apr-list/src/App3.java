import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(34,21,26,1,54,38,76,90,89);
		Collections.sort(list);
		//we are able to sort a list of Integers, because,
		//we are able to compare 2 Integers
		Integer i=30;
		Integer j=30;
		System.out.println(i.compareTo(j));
		System.out.println(list);
	}
}
