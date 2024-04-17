import java.util.Scanner;

abstract class Shape
{
	public abstract String calculateArea();
	
}

class Rectangle extends Shape
{
	public String calculateArea()
	{
		return "l*b";
	}
}

class Circle extends Shape
{
	public String calculateArea()
	{
		return "22/7*r*r";
	}
}

class Triangle extends Shape
{
	public String calculateArea()
	{
		return "1/2*b*";
	}
}

public class App {

	public static void main(String[] args) {
		int  i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Which shape you want to draw?");
		System.out.println("1: Rectange\n"
				+ "2: Circle\n"
				+ "3: Triangle\n"
				+ "4: Exit");
		Shape s=null;		//s is not an object. it is a ref var
		do
		{
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:	//rectangle
				s=new Rectangle();
				break;
			case 2:	//circle
				s=new Circle();
				break;
			case 3:	//triangle
				s=new Triangle();
				break;
			case 4:
				System.exit(0);
				break;
			}
			System.out.println(s.calculateArea());
		}while(i==1);
		
		
	}

}
