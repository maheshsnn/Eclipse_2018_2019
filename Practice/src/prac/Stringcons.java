package prac;

public class Stringcons {
	
	 int e=10 ;
	 int r=5 ;
	Stringcons(int x,int y)
	
	{
	System.out.println(x+y);
	}
	Stringcons(String x)
	{
		System.out.println(x);
	}
	public void mahesh()
	{
		int o=9 ;
		int b=6 ;
		System.out.println(this.e);
		System.out.println(this.r);
		System.out.println(o);
		System.out.println(b);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stringcons h=new Stringcons(10,5);
h.mahesh();



	}

}
