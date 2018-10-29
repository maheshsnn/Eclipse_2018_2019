package pack1;

interface I1
{
	void meth1();
	void meth2();
}
class Imple implements I1
{
	public void meth1()
	{
		System.out.println("This is interface first method");
	}
	public void meth2()
	{
		System.out.println("This is interface second method");
	}
	public void show()
	{
		System.out.println("This is show method");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Imple b=new Imple();
		b.meth1();
		b.meth2();
		b.show();

	}

}
