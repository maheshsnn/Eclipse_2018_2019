package prac;

class Cons 
{
	int k=5 ;
	int j=4;
	/*Cons(int k ,int j)
	{
		this.k=k ;
		this.j=j;
		System.out.println(k+j);
		
	}*/

public  void	Const()
	{
	int k=8 ,j=9 ;
	System.out.println(this.j);
	System.out.println(j);
	}
	public static void main(String[] args) 
	{
		Cons o=new Cons();
		o.Const();
		
		
	}
}