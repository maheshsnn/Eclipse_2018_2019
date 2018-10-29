package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;



public class Java_practice {
	
	int z=10;
	Java_practice()
	{
		System.out.println("value is java practice null");
		
	}
	
	Java_practice(int a)
	{
		System.out.println("test jkasndjkashdjkn");
	}
	public static void main(String[] args) {
		
	}
	
}
class below extends Java_practice
{
	int x,y;
	below()
	{
		
		super(10);
		//super();
		//System.out.println(super.z);
		
		this.x=x;
		
	}
	below(int a)
	{
		
		this();
		System.out.println("value is below int a");
	}
	
	public static void main(String[] args) {
		below c=new below(1);
	}
	
}