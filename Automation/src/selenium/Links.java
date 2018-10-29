package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Links 
{
	WebDriver d ;
	
	@BeforeClass 
	public void setup()
	{
		WebDriverWait wait=new WebDriverWait(d,500);
		wait.until(ExpectedConditions.visibilityOf(d.findElement(By.xpath(""))));
		
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
	}
	@Test
	public void tes()
	{
		
		d.get("http:\\www.seleniumhq.org");
		List<WebElement>l=d.findElements(By.xpath("//li[starts-with(@id,'menu')]"));
		System.out.println("No of Links are" + l.size());
		System.out.println("The Links are");
		String links[]=new String[l.size()];
		
		for(int i=0;i<l.size();i++)
		{
			l.get(i).getText();
		}
		int i=0 ;
		for (WebElement e:l)
		{
			
			links[i]=e.getText();
			System.out.println(e.getText());
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
