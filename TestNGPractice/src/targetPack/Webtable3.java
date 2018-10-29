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

public class Webtable3 {
	
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
	B.selectByIndex(12);
	
	List<WebElement>ROWS=d.findElements(By.xpath("//table[@ id='Table9']/tbody/tr"));
	System.out.println("No of ROWS"+ROWS.size());
	List<WebElement>COLOUMNS=d.findElements(By.xpath("//table[@ id='Table9']/tbody/tr/td"));
	System.out.println("No of COLOUMNS"+COLOUMNS.size());
	
	int X,Y;
	X=1;
	for(WebElement rows:ROWS)
	{
		List<WebElement>coloumns=rows.findElements(By.xpath("td"));	
		Y=1;
				for(WebElement zz:coloumns)	
					
				{
					System.out.println("Rows#1"+X+",Col#1"+Y+",Text="+zz.getText());
					Y++;
				}
				X++ ;
	}
	
	
	

}}
