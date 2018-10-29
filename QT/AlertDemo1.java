package targetpack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo1 {
	WebDriver d;
	@Test
	public void testAlertDemo() throws Exception
	{
		//d.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
		d.get("https://retail.onlinesbi.com/retail/login.htm");
		assertEquals("State Bank of India",d.getTitle());
		d.findElement(By.className("phisingcontinueButton")).click();
		//Click on Login button
		d.findElement(By.id("Button2")).click();
		//Switch driver focus to alert
		Alert al=d.switchTo().alert();
		//Verify alert Text
		assertEquals("Enter username",al.getText());
		//Click on Ok button
		al.accept();
		//Enter user name
		d.findElement(By.id("username")).sendKeys("Selenium");
		//Click on Login button
		d.findElement(By.id("Button2")).click();
		//Verify alert Text
		assertEquals("Enter password",al.getText());
		//Click on Ok button
		al.accept();
		d.findElement(By.id("label2")).sendKeys("Selenium");
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
