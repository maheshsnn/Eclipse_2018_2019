package pack1;
class E
{
	static int x=10,y;
	
	E()
	{
		System.out.println("This is constructor");
	}
	static void sum()
	{
		System.out.println("Sum of x & y is:"+(x+y));
	}
	static
	{
		y=x/2;
		x=y;
		System.out.println("This is static block");
	}
}

public class StaticDemo {

	public static void main(String[] args) {
				
       //E b=new E();
		E.sum();		
	}

}
