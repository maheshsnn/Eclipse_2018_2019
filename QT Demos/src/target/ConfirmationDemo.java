package target;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationDemo {
	WebDriver d;
	@Test
	public void testAlertDemo() throws Exception
	{
		d.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
		d.manage().window().maximize();
		d.get("http://jsbin.com/enifaf");
		d.findElement(By.xpath("//button[@onclick='launchConfirm()']")).click();
		//Switch driver focus to Confirmation
		Alert al =d.switchTo().alert();
		assertEquals("Press a button!",al.getText());
		//Click on Cancel button
		al.dismiss();
		assertEquals("You pressed Cancel!",d.findElement(By.id("chosenButton")).getText());
		Thread.sleep(5000);
		
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
