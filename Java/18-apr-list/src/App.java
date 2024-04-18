import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> marks=new ArrayList<>();
		marks.add(20);
		marks.add(50);
		marks.add(1);
		marks.add(60);
		marks.add(35);
		marks.add(40);
		marks.remove(new Integer(1));
		
		System.out.println(marks);
	}

}
