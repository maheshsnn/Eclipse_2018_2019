package targetPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Webtable {
	WebDriver d;
	@BeforeMethod
	public void setUp() throws Exception
	{
		d=new FirefoxDriver();
	}
	@AfterMethod
	public void tearDown()
	{
		d.quit();
	}
	@Test
	public void dynamicTable()throws Exception
	{
		d.get("http://aponline.gov.in/apportal/contact/sec_select.asp?sid=1%22");
		Select B=new Select(d.findElement(By.id("Select1")));
		B.selectByIndex(2);
		
		List<WebElement>ROWS=d.findElements(By.xpath("//table[@id='Table9']/tbody/tr"));
		System.out.println("NO OF ROWS"+ROWS.size());
		List<WebElement>COLOUMNS=d.findElements(By.xpath("//table[@id='Table9']/tbody/tr/td"));
		System.out.println("NO OF COLOUMNS"+COLOUMNS.size());
		
		int x,y;
		x=1;
		for(WebElement trElement:ROWS)
		{
			List<WebElement>coloumns=trElement.findElements(By.xpath("td"));
			
				y=1;
				for(WebElement tdElement:coloumns)
				{
					System.out.println("Row#"+x+",col#"+y+",Text="+tdElement.getText());
					y++;
				}
				x++;
		}	
	
		
		
		
	}
	
	
	
	
	}


