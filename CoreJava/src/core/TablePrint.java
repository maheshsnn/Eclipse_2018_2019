package core;

import org.junit.Test;

public class TablePrint {
	
	
	@Test
	public void setup()
	{
	
	int n=9 ;
	
	System.out.println("9th table ");
	
	for(int c=1;c<=10;c++)
	{
		System.out.println(n+"*"+c+"=" +(n*c));
	}

}
}