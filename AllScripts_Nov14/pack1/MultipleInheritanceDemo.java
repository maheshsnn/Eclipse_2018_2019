package pack1;
interface I2
{
	void meth1();
}
interface I3
{
	void meth2();
}
interface I4 extends I3,I2
{
	void meth3();
}

class MultiInher implements I4
{
	public void meth1()
	{
		System.out.println("This is interface I1 method ");
	}
	public void meth2()
	{
		System.out.println("This is interface I2 method ");
	}
	public void meth3()
	{
		System.out.println("This is interface I3 method ");
	}
}
public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		MultiInher b=new MultiInher();
		b.meth1();
		b.meth2();
		b.meth3();

	}

}
