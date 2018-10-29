package targetpack;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncWithExplicitwait {
WebDriver d;
	
    @Test
    public void testSync() throws Exception
    {
    	//d.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
    	d.get("https://www.google.co.in/?gws_rd=ssl");
    	assertEquals("Google",d.getTitle());
    	d.findElement(By.id("gbqfq")).sendKeys("Selenium");
    	d.findElement(By.id("gbqfb")).click();
    	
    	WebDriverWait wait=new WebDriverWait(d,180);
    	WebElement e=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Selenium - Web Browser Automation")));
    	e.click();
    	
    	//d.findElement(By.linkText("Selenium - Web Browser Automation")).click();
    	d.findElement(By.linkText("Download")).click();
    	assertEquals("Selenium IDE",d.findElement(By.xpath("//div[@id='mainContent']/h3")).getText());
    	assertTrue(d.findElement(By.xpath("//div[@id='mainContent']/h3")).getText().contains("Selenium IDE"));
    	Thread.sleep(4000);
    }
	@Before
	public void setUp()
	{
		//d=new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "F:\\Selenium_Scripts_Nov14\\Lib\\IEDriverServer.exe");
		//d=new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Scripts_Nov14\\Lib\\chromedriver.exe");
		d=new ChromeDriver();
	}
	@After
	public void tearDown()
	{
		d.quit();
	}

}
