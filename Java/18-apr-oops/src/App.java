class Parent{
	public void method()
	{
		System.out.println("Parent method");
	}
}
class Child extends Parent
{
	public void method()	//overriding
	{
		System.out.println("Child method");
	}
	public void method(int i)	//overloading
	{
		System.out.println("child method with arg");
	}
}
public class App {

	public static void main(String[] args) {
		Child c=new Child();
		c.method();
	}

}
