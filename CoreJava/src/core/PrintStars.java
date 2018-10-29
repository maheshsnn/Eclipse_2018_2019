package core;

import org.junit.Test;

public class PrintStars {
	
	@Test
	public void setup()
	{
	
//		
//		for(int i=0;i<=9;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//				
//			}
//			System.out.println("*");
//			
//		}
		
		//or
		
		int row,numbers;
		
		for (row=0;row<=9;row++)
		{
			
			for(numbers=1;numbers<=row;numbers++)
			{
			
			System.out.print("*");
			
			
		}
			System.out.println();
		
		}
		
		
	}

}
