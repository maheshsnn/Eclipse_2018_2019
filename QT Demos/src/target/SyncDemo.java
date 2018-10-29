package target;

import static org.junit.Assert.*;

//import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncDemo {
	WebDriver d;
	@Test
	public void testSync() throws Exception
	{
		//d.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		d.get("https://www.google.co.in/?gws_rd=ssl");
		assertEquals("Google",d.getTitle());
		//Type text
		d.findElement(By.id("gbqfq")).sendKeys("Selenium");
		//Click on search button
		d.findElement(By.id("gbqfb")).click();
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(d,180);
		WebElement link=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Selenium - Web Browser Automation")));
		link.click();
		//Click on first link
		//d.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		//Click on download link
		d.findElement(By.linkText("Download")).click();
		assertEquals("Selenium IDE",d.findElement(By.xpath("//div[@id='mainContent']/h3")).getText());
		Thread.sleep(5000);
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
