package targetpack;

import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SyncDemo {
WebDriver d;
	
    @Test
    public void testSync() throws Exception
    {
    	d.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
    	d.get("https://www.google.co.in/?gws_rd=ssl");
    	assertEquals("Google",d.getTitle());
    	d.findElement(By.id("gbqfq")).sendKeys("Selenium");
    	d.findElement(By.id("gbqfb")).click();
    	d.findElement(By.linkText("Selenium - Web Browser Automation")).click();
    	d.findElement(By.linkText("Download")).click();
    	assertEquals("Selenium IDE",d.findElement(By.xpath("//div[@id='mainContent']/h3")).getText());
    	assertTrue(d.findElement(By.xpath("//div[@id='mainContent']/h3")).getText().contains("Selenium IDE"));
    	Thread.sleep(4000);
    }
	@BeforeMethod
	public void setUp()
	{
		//d=new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "F:\\Selenium_Scripts_Nov14\\Lib\\IEDriverServer.exe");
		//d=new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Scripts_Nov14\\Lib\\chromedriver.exe");
		d=new ChromeDriver();
	}
	@AfterMethod
	public void tearDown()
	{
		d.quit();
	}

}
