
public class AppCasting {

	public static void main(String[] args) {
		short score=20;
		long marks=score;		//implict casting
		score=(short) marks;		//explicit casting
		
		marks=1234567890;
		score=(short) marks;	//loss of precision
		System.out.println(score);
		
		Object o=new Object();
		String str=(String) o;	//explicit		narrowing
		o=str;					//implicit		widening
		//String class extends Object class
	}

}
