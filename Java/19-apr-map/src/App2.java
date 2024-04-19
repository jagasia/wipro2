import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App2 {

	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  String input=sc.nextLine();
		  Map<Character, Integer> map=new LinkedHashMap<>();
		  
		  for(Character c : input.toCharArray())
		  {
			  //if c is already found in map, then increment the count 
			  //if c is not found in the map, then it should be count as 1
//			  Integer value = map.get(c);
//			  if(value==null)
//			  {
//				  value=0;
//			  }
//			  value++;
			  
			  Integer count = map.getOrDefault(c, 0);
			  count++;
			  map.put(c, count);
		  }
		  
		  for(Entry<Character, Integer> entry:map.entrySet())
		  {
			  System.out.println(entry.getKey()+"\t"+entry.getValue());
		  }
	  }

}
