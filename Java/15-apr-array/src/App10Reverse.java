import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App10Reverse {

	public static void main(String[] args) {
		Integer arr[]= {9, 48, 78, 86, 52, 24, 31, 12, 100};
		List<Integer> list = Arrays.asList(arr);
		Collections.reverse(list);
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
	}

}
