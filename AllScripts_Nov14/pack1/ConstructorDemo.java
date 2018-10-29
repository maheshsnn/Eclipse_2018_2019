package pack1;

class B
{
	int x,y;
	B(int a,int b)
	{
		x=a;
		y=b;
	}
	void sum()
	{
		System.out.println("Sum:"+(x+y));
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		B b1=new B(10,20);
		b1.sum();
		B b2=new B(20,30);
		b2.sum();

	}

}
