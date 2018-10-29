package javaprac;

public class AndOr
{
	public static void main(String[]args){
	
	int a,b;
	a=10;
	b=-10;
	if (a>=0 &&b>=0)
	{
		System.out.println("both nums are positive");
	}
	else if(a>=0||b>=0)
	{
		System.out.println("one of the number is positive ");
	}
	else{
		System.out.println("Both are negative");
	}
			

}}
