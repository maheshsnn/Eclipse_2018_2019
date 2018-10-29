package targetPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LinksDemo {
	 WebDriver d;
	// @Parameters("browser")
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
		d.get("http://en.wikipedia.org/wiki/Manual_testing");
		//List<WebElement> l=d.findElements(By.xpath("//li[starts-with(@id,'ca')]"));
	    List<WebElement> x=d.findElements(By.xpath("//li[starts-with(@id,'ca')]"));
		System.out.println("no of links"+x.size());
		String links[]=new String[x.size()];
		int i=0;
		for(WebElement e:x)
		{
			links[i]=e.getText();
			System.out.println(links[i]);
			i++;
		}
		for(String t:links)
		{
		d.findElement(By.linkText(t)).click();
		Thread.sleep(5000);
		if (d.getTitle().equals("error 404"))
			
		{
		System.out.println("this link is not available");
		}
		else{
			System.out.println("this link is  available");
		}
		
		
		
		}
			
		
		
		
		
		
				
				
		
	}


}
