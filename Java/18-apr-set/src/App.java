import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		HashSet<Integer> marks=new HashSet<>();
		marks.add(50);
		marks.add(40);
		marks.add(10);	//added
		marks.add(60);
		marks.add(30);
		marks.add(10);	//rejected
		marks.add(70);
		marks.add(20);
		marks.add(10);	//rejected
		marks.add(80);
		marks.add(10);	//rejected
		marks.add(100);
		for(Integer i:marks)
			System.out.println(i);
	}

}
