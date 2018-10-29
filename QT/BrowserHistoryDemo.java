package targetpack;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserHistoryDemo {
	WebDriver d;
	@Test
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
	@Before
	public void setUp()
	{
		d=new FirefoxDriver();
	}
	@After
	public void tearDown()
	{
		d.quit();
	}

}
