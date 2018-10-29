package targetpack;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameDemo {
	WebDriver d;
	@Test
	public void testFrame() throws Exception
	{
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("http://jqueryui.com/autocomplete/");
		assertEquals("Autocomplete | jQuery UI",d.getTitle());
		//Switch driver focus to frame
		//d.switchTo().frame(d.findElement(By.className("demo-frame")));
		List<WebElement> f=d.findElements(By.tagName("iframe"));
		System.out.println("No of frames:"+f.size());
		d.switchTo().frame(0);
		d.findElement(By.id("tags")).sendKeys("Selenium");
		Thread.sleep(4000);
	}
	@Before
	public void setUp()
	{
		//d=new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "F:\\Selenium_Sripts_Jan15\\Lib\\IEDriverServer.exe");
		//d=new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Sripts_Jan15\\Lib\\chromedriver.exe");
		d=new ChromeDriver();
	}
	@After
	public void tearDown()
	{
		d.quit();
	}

}
