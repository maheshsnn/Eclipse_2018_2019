package prac;

public class AlgorithmProg {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		AlgorithmProg  OB=new AlgorithmProg () ;
		OB.additions();
		OB.substraction();
		OB.multications();
		OB.division();
		
	}
	
	public void additions()
	{
		int a,b,c ;
		a=5 ;
		b=6;
		c=a+b ;
		System.out.println(c);
	}
	public void substraction()
	{
		int a,b,c ;
		a= 6 ;
		b=3 ;
		c=a-b;
		System.out.println(c);
	}
	public void multications()
	{
		int a,b,c ;
		a=10;
		b=5 ;
		c=a*b ;
		
		System.out.println(c);
		
	}
	public void division()
	{
		int a,b,c ;
		a=10 ;
		b=5;
		c=a/b ;
		System.out.println(c);
	}

}
