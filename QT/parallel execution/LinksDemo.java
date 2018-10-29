package targetpack;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LinksDemo {
	 WebDriver d;
		
	@Test(retryAnalyzer=Retry.class)
	public void links() throws Exception
	{
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
		
	}
	//Reading browser name from XML
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browser)
	{
		if(browser.equalsIgnoreCase("FF"))
		{
			d=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\Selenium_Sripts_Jan15\\Lib\\IEDriverServer.exe");
			d=new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("GC"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Sripts_Jan15\\Lib\\chromedriver.exe");
			d=new ChromeDriver();
		}
		
	}
	@AfterMethod
	public void tearDown()
	{
		d.quit();
	}

}
