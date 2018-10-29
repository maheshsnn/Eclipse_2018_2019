package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Orangehrm {
	
	WebDriver d;
	
	@Test
	public void mm() throws Exception
	{
		
		d=new FirefoxDriver();
		d.get("http://opensource.demo.orangehrmlive.com/");
		d.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		d.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin");
		d.findElement(By.xpath("//*[@id='btnLogin']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[2]/div/a/img")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id='frmFilterLeave']/fieldset/ol/li[1]/img")).click();
		
		List<WebElement>dates=d.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td"));
		int date=dates.size();
		
		for(int i=0;i<date;i++)
		{
			String datelinkname=dates.get(i).getText();
			if(datelinkname.equals("25"))
			{
				dates.get(i).click();
				//break;
			}
		}
		System.out.println("date clicked ");
		 
		
		List<WebElement>tb=d.findElements(By.xpath("//*[@id='resultTable']/tbody/tr[1]/td[2]/a"));
		int tablesize =tb.size();
		//String v=i+1) ;
		for(int i=0;i<tablesize;i++)
		{
			String elementname=tb.get(i).getText();
			
			if(elementname.equals("Linda Anderson"))
			{
				d.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+(i+1)+"]/td[6]/a")).click();
				//tb.get(i).click();
			}
			
		}
		
		
		
	}

}
