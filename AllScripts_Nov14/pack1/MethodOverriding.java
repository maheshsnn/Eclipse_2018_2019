package pack1;
class X
{
	public void show()
	{
		System.out.println("This is parent class method");
	}
}
class Y extends X
{
	public void show()
	{
		System.out.println("This is Child class method");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Y b=new Y();
		b.show();

	}

}
