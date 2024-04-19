import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		Map<Integer, String> map=new TreeMap<>();
		map.put(5, "Australia");
		map.put(1, "India");
		map.put(3, "Pakistan");
		map.put(2, "Bangladesh");
		map.put(7, "Sri lanka");
		map.put(6, "Japan");		//add an entry
		map.put(6, "China");		//update an entry
		
		for(Entry<Integer, String> e:map.entrySet())
		{
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
	}

}
