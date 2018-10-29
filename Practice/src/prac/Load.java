package prac;

class  Load
{
	public static void main(String[] args) 
	{
		
		Load m=new Load();
		m.ma(10, 15);
		m.ma(10);
		
		
		
	}

	public  void ma(int x,int y)
	{
	int z=x+y ;
	System.out.println(z);
	
	}
	public  void ma(int x)
	{
		System.out.println(x);
	}
}
