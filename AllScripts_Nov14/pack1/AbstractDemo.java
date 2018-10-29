package pack1;
abstract class Shapes
{
	abstract void area();
	void show()
	{
		System.out.println("This is abstract class method");
	}
}
class Triangle extends Shapes
{
	int l,b;
	Triangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	void area()
	{
		System.out.println("Area of Triangle is: "+(0.5*l*b));
	}
}
class Rect extends Shapes
{
	int l,b;
	Rect(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	void area()
	{
		System.out.println("Area of Rectangle is: "+(l*b));
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Triangle t=new Triangle(10,20);
		Rect r=new Rect(10,20);
		t.area();
		t.show();
		r.area();
		r.show();

	}

}
