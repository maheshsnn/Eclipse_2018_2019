package targetpack;

import static org.testng.Assert.assertEquals;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LinksDemo {
	WebDriver d; 
	    @Test(retryAnalyzer=Retry.class)
	    public void testLinks() throws Exception
	    {
	    	d.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	    	d.manage().window().maximize();
	    	d.get("http://docs.seleniumhq.org/");
	    	assertEquals("Selenium - Web Browser Automation",d.getTitle());
	    	List<WebElement> l=d.findElements(By.xpath("//li[starts-with(@id,'menu')]"));
	    	System.out.println("No of links: "+l.size());
	    	System.out.println(" ***** Link names are ***** ");
	    	//Print link names
	    	String links[]=new String[l.size()];
	    	int i=0;
	    	for(WebElement e:l)
	    	{
	    		links[i]=e.getText();
	    		System.out.println(links[i]);
	    		i++;
	    	}
	    	//Click the links
	    	for(String t:links)
	    	{
	    		d.findElement(By.linkText(t)).click();
	    		if(d.getTitle().contains("Error 404"))
	    		{
	    			System.out.println("Link: "+t+ ":is not working");
	    		}
	    		else
	    		{
	    			System.out.println("Link: "+t+ ": is working fine");
	    		}
	    	}
	    	
	    	Thread.sleep(4000);
	    }
	 //Reading browse name from XML
	    @Parameters({"browser"})
		@BeforeMethod
		public void setUp(String browser) throws Exception
		{
			if(browser.equals("FF"))
			{
				DesiredCapabilities b = DesiredCapabilities.firefox();
				//d = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),b);
				d=new FirefoxDriver();
				
			}
			else if(browser.equals("IE"))
			{
				System.setProperty("webdriver.ie.driver","F:\\Selenium_Scripts_Sep14\\Lib\\IEDriverServer.exe");
				DesiredCapabilities b = DesiredCapabilities.internetExplorer();
				//d = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),b);
				d=new InternetExplorerDriver();
			}
			else if(browser.equals("GC"))
			{
				System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Scripts_Sep14\\Lib\\chromedriver.exe");
				DesiredCapabilities b = DesiredCapabilities.chrome();
				//d = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),b);
				d=new ChromeDriver();
			}
				
			d.manage().deleteAllCookies();
			d.manage().window().maximize();
		}
	@AfterMethod
	public void tearDown()
	{
		d.quit();
	}

}
