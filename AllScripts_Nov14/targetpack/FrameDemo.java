package targetpack;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
    WebDriver d;
	
    @Test
    public void testFrame() throws Exception
    {
    	d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	d.get("http://jqueryui.com/autocomplete/");
    	assertEquals("Autocomplete | jQuery UI",d.getTitle());
    	//switch focus to frame
    	//d.switchTo().frame(0);
    	d.switchTo().frame(d.findElement(By.className("demo-frame")));
    	d.findElement(By.id("tags")).sendKeys("Selenium");
    	
    	
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
