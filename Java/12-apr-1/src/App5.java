
public class App5 {

	public static void main(String[] args) {
		char c='_';	//		\0 means null
//		System.out.println(c.isLetter());  //NOT POSSIBLE
	
		System.out.println(Character.isDigit(c));
		System.out.println(Character.isLetter(c));
		System.out.println(Character.isAlphabetic(c));
	}

}
