package targetpack;

import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

public class BrowserHistoryDemo {
	WebDriver d;
	@Test(retryAnalyzer=Retry.class)
	public void testBrowserHistory() throws Exception
	{
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
