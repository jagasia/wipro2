class MyInt
{
	int no;
}

public class App6 {

	public static void swap(MyInt i, MyInt j)
	{
		MyInt temp=new MyInt();
		temp.no=i.no;
		i.no=j.no;
		j.no=temp.no;
		System.out.printf("i=%d\tj=%d\n",i.no,j.no);
	}
	
	public static void main(String[] args) {
		MyInt a=new MyInt();
		a.no=20;
		MyInt b=new MyInt();
		b.no=30;
		swap(a,b);
		System.out.printf("a=%d\tb=%d",a.no,b.no);
	}

}
