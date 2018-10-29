package target;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserhistry {
	WebDriver d;
	@Before
	public void setUp()

	{
	d=new FirefoxDriver();
	d.manage().window().maximize();
	
	}
	@After
	public void tearDown()
	{
		d.quit();
	}
	@Test
	public void testBrowserhistry() throws InterruptedException
	{
		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//d.get("http://jqueryui.com/");
		d.navigate().to("http://jqueryui.com/");
		assertEquals("jQuery UI",d.getTitle());
		d.findElement(By.linkText("Draggable")).click();
		Thread.sleep(5000);
		d.navigate().back();
		Thread.sleep(5000);
		d.navigate().forward();
		Thread.sleep(5000);
		d.navigate().refresh();
		Thread.sleep(5000);
		d.manage().deleteAllCookies();
		Thread.sleep(5000);
		
	}

}
