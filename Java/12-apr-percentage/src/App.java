import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int totalRuns=0;
		int noOfFours=0;
		int noOfSixes=0;
		Scanner sc=new Scanner(System.in);
		totalRuns=sc.nextInt();
		noOfFours=sc.nextInt();
		noOfSixes=sc.nextInt();
		int scoreByFours=4*noOfFours;
		int scoreBySixes=6*noOfSixes;
		int byRun=totalRuns-scoreByFours-scoreBySixes;
		float percentage=100*(float)byRun/totalRuns;
//		System.out.println(percentage);
		//how to display only 2 digits precison?
		
//		percentage*=100;
//		percentage=Math.round(percentage);
//		percentage/=100;
//		System.out.println(percentage);
		
		
		String per=String.format("%.2f", percentage);
		percentage=Float.parseFloat(per);
		System.out.println(percentage);
	}

}
