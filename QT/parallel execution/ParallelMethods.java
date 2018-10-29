package targetpack;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ParallelMethods {
	@Test
	public void links() throws Exception
	{
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		d.manage().window().maximize();
		d.get("http://docs.seleniumhq.org/");
		assertEquals("Selenium - Web Browser Automation",d.getTitle());
		List<WebElement> l=d.findElements(By.xpath("//li[starts-with(@id,'menu')]"));
		System.out.println("No of links: "+l.size());
		System.out.println("**** Link Names are **** ");
		String links[]=new String[l.size()];
		int i=0;
		for(WebElement e:l)
		{
			links[i]=e.getText();
			System.out.println(e.getText());
			i++;
		}
		for(String t:links)
		{
			d.findElement(By.linkText(t)).click();
			if(d.getTitle().equals("Error 404"))
			{
				System.out.println("Link: "+t +": is not working");
			}
			else
			{
				System.out.println("Link: "+t +": is working fine");
			}
		}
		
		d.quit();
		
	}
	@Test
	public void testWebElements() throws Exception
	{
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
		d.get("http://book.theautomatedtester.co.uk/");
		//Type text
		d.findElement(By.id("q")).sendKeys("Selenium");
		//Click on Chapter1 link
		d.findElement(By.linkText("Chapter1")).click();
		WebElement radio=d.findElement(By.id("radiobutton"));
		//Check status of radio button
		if(radio.isSelected())
		{
			System.out.println("Radio button is already selected");
		}
		else
		{
			radio.click();
		}
		WebElement checkbox=d.findElement(By.name("selected(1234)"));
		//Check status of check box
		if(checkbox.isSelected())
		{
			System.out.println("Check box is already selected");
		}
		else
		{
			checkbox.click();
		}
		//Select option from DD
		Select dd=new Select(d.findElement(By.id("selecttype")));
		dd.selectByIndex(2);
		WebElement e=dd.getFirstSelectedOption();
		System.out.println("Selected option is: "+e.getText());
		//Text area
		d.findElement(By.id("html5div")).clear();
		d.findElement(By.id("html5div")).sendKeys("Selenium");
		Thread.sleep(5000);
		d.quit();
	}
	@Test
	public void testBrowserHistory() throws Exception
	{
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
		d.navigate().to("http://docs.seleniumhq.org/");
		assertEquals("Selenium - Web Browser Automation",d.getTitle());
		d.findElement(By.linkText("Download")).click();
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().forward();
		Thread.sleep(2000);
		d.navigate().refresh();
		Thread.sleep(2000);
		d.quit();
	}

}
