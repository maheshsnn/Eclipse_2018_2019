package targetPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksDemo2 {
	 WebDriver d;
	@BeforeMethod
	public void setUp()
	{
		d=new FirefoxDriver();
	}
	
	@AfterMethod
	public void tearDown()
	{
		d.quit();
	}
	
	@Test
	public void setuplinks() throws InterruptedException
	{
		d.get("http://docs.seleniumhq.org/");
		List<WebElement> l=d.findElements(By.xpath("//li[starts-with(@id,'menu')]"));
		System.out.println("No of links"+l.size());
		String links[]=new String[l.size()];
		int i=0;
		for(WebElement e:l)
		{
			links[i]=e.getText();
			System.out.println(links[i]);
			i++;
		}
		
		for(String t:links)
		{
			d.findElement(By.linkText(t)).click();
			if(d.getTitle().equals("error"))
					{
				System.out.println("link not available");
					}
			else
			{
				System.out.println("link  available");
			}
		}
		
		
			
		}
	

}
