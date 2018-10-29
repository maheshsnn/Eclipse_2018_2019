package prac;

public class Thism {

	public static void main(String[] args) {
		Thism o=new Thism(10,5,6);

	}
	
	Thism(int i,int j,int k)
	{
		this(j,k);
		System.out.println(i);
		
	}
	Thism(int j,int k)
	{
		this(k);
		System.out.println(j);
		
	}
	Thism(int k)
	{
		
		System.out.println(k);
		
	}

}
