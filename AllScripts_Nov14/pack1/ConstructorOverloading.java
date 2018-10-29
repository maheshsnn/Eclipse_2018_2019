package pack1;

class C
{
	int x,y;
	C()
	{
		System.out.println("This is default constructor");
	}
	C(int x)
	{
		System.out.println("x:"+x);
	}
	C(int a,int b)
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println("Sum:"+(x+y));
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		/*C b1=new C(10,20);
		b1.sum();*/
		C b1=new C();
		

	}

}
