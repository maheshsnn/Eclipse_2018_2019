package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class webtable_handling {
	
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		
	List<WebElement>ROW=driver.findElements(By.xpath("/tr"));
	int row_size=ROW.size();
	
	List<WebElement>COlumns=driver.findElements(By.xpath("/tr/td"));
	int column_size=COlumns.size();
	
	
	int x,y;
	
	
	x=1;
	for(WebElement row:ROW)
	{
		
		List<WebElement>columns=driver.findElements(By.xpath("/td"));
		y=1;
		
		for(WebElement z:columns)
		{
			
			System.out.println(x +"  "+y+  ""  +"text="+z.getText());
		y++;
		}
		x++;
	}
	
	
	for(int i=0;i<row_size;i++)
	{
		String textname=ROW.get(i).getText();
		
		if(textname.equals(""))
		{
			
			
		}
		
	}
	
	}
	

}
