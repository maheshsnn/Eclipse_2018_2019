package pack1;

public class P {
    int x,y;
	public P(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void sum()
	{
		System.out.println("Sum of x & y is:"+(x+y));
	}
	public void sub()
	{
		System.out.println("Subtraction of x & y is:"+(x-y));
	}
	public static void show()
	{
		System.out.println("This is show method");
	}

}
